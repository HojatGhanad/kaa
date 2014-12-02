/*
 * Copyright 2014 CyberVision, Inc.
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

#include "kaa_mem.h"

#ifdef KAA_TRACE_MEMORY_ALLOCATIONS

#include <stdlib.h>

#if KAA_LOG_LEVEL_TRACE_ENABLED
static kaa_logger_t * logger_ = NULL;
#endif

void *kaa_trace_memory_allocs_malloc(size_t s, const char *file, int line) {
#if KAA_LOG_LEVEL_TRACE_ENABLED
    void *ptr = malloc(s);
    if (logger_)
        kaa_log_write(logger_, file, line, KAA_LOG_TRACE, KAA_ERR_NONE, "Allocated (using malloc) %zu bytes at {%p}", s, ptr);
    return ptr;
#else
    return malloc(s);
#endif
}

void *kaa_trace_memory_allocs_calloc(size_t n, size_t s, const char *file, int line) {
#if KAA_LOG_LEVEL_TRACE_ENABLED
    void *ptr = calloc(n, s);
    if (logger_)
        kaa_log_write(logger_, file, line, KAA_LOG_TRACE, KAA_ERR_NONE, "Allocated (using calloc) %zu blocks of %zu bytes (total %zu) at {%p}", n, s, n*s, ptr);
    return ptr;
#else
    return calloc(n, s);
#endif
}

void kaa_trace_memory_allocs_free(void * p, const char *file, int line)
{
#if KAA_LOG_LEVEL_TRACE_ENABLED
    if (logger_)
        kaa_log_write(logger_, file, line, KAA_LOG_TRACE, KAA_ERR_NONE, "Going to deallocate memory at {%p}", p);
#endif
    free(p);
}

void kaa_trace_memory_allocs_set_logger(kaa_logger_t *logger)
{
#if KAA_LOG_LEVEL_TRACE_ENABLED
    logger_ = logger;
#endif
}

#endif


