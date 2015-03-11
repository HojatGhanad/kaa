/*
 * Copyright 2014-2015 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#ifndef DEFAULTLOGUPLOADSTRATEGY_HPP_
#define DEFAULTLOGUPLOADSTRATEGY_HPP_

#include <chrono>
#include <cstdint>

#include "kaa/log/ILogUploadStrategy.hpp"
#include "kaa/channel/IKaaChannelManager.hpp"

namespace kaa {

/**
 * @brief
 */
class DefaultLogUploadStrategy: public ILogUploadStrategy {
public:
    DefaultLogUploadStrategy(IKaaChannelManagerPtr manager);

    virtual LogUploadStrategyDecision isUploadNeeded(ILogStorageStatus& status);

    virtual void onTimeout();
    virtual void onFailure(LogDeliveryErrorCode code);

    virtual std::size_t getBatchSize() { return batchSize_; }
    virtual std::size_t getTimeout() { return uploadTimeout_; }

    void setBatchSize(std::size_t size) { batchSize_ = size; }
    void setUploadTimeout(std::size_t timeout) { uploadTimeout_ = timeout; }
    void setRetryPeriod(std::size_t period) { retryReriod_ = period; }
    void setVolumeThreshold(std::size_t maxVolume) { uploadVolumeThreshold_ = maxVolume; }
    void setCountThreshold(std::size_t maxCount) { uploadCountThreshold_ = maxCount; }

public:
    static const std::size_t DEFAULT_BATCH_SIZE = 8 * 1024; /*!< The default value (in bytes) for the maximum size of
                                                                 the report pack that will be delivered in a single
                                                                 request to the Operaions server. */

    static const std::size_t DEFAULT_UPLOAD_TIMEOUT = 2 * 60; /*!< The default value (in seconds) for time to wait
                                                                   the log delivery response. */

    static const std::size_t DEFAULT_RETRY_PERIOD = 5 * 60; /*!< The default value (in seconds) for time to postpone
                                                                 log upload. */

    static const std::size_t DEFAULT_UPLOAD_VOLUME_THRESHOLD = 8 * 1024; /*!< The default value (in bytes) for log
                                                                              volume to initiate the log upload. */

    static const std::size_t DEFAULT_UPLOAD_COUNT_THRESHOLD = 64; /*!< The default value for the log count to initiate
                                                                       the log upload. */

private:
    std::size_t batchSize_ = DEFAULT_BATCH_SIZE;

    std::size_t uploadTimeout_ = DEFAULT_UPLOAD_TIMEOUT;
    std::size_t retryReriod_ = DEFAULT_RETRY_PERIOD;

    std::size_t uploadVolumeThreshold_ = DEFAULT_UPLOAD_VOLUME_THRESHOLD;
    std::size_t uploadCountThreshold_ = DEFAULT_UPLOAD_COUNT_THRESHOLD;

    typedef std::chrono::system_clock Clock;
    std::chrono::time_point<Clock> nextUploadAttemptTS_;

    IKaaChannelManagerPtr channelManager_;
};

} /* namespace kaa */

#endif /* DEFAULTLOGUPLOADSTRATEGY_HPP_ */
