/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.tez.common;

import org.apache.hadoop.classification.InterfaceAudience.Private;
import org.apache.hadoop.classification.InterfaceStability.Evolving;


/**
 * Meant for user configurable job properties. For others look at {@link Constants}
 *
 */

// TODO EVENTUALLY A description for each property.
@Private
@Evolving
public class TezJobConfig {




  /** The number of milliseconds between progress reports. */
  public static final int PROGRESS_INTERVAL = 3000;

  public static final long DEFAULT_COMBINE_RECORDS_BEFORE_PROGRESS = 10000;

  /**
   * Configuration key to enable/disable IFile readahead.
   */
  public static final String TEZ_ENGINE_IFILE_READAHEAD =
      "tez.engine.ifile.readahead";
  public static final boolean DEFAULT_TEZ_ENGINE_IFILE_READAHEAD = true;

  /**
   * Configuration key to set the IFile readahead length in bytes.
   */
  public static final String TEZ_ENGINE_IFILE_READAHEAD_BYTES =
      "tez.engine.ifile.readahead.bytes";
  public static final int DEFAULT_TEZ_ENGINE_IFILE_READAHEAD_BYTES =
      4 * 1024 * 1024;

  /**
   * 
   */
  public static final String RECORDS_BEFORE_PROGRESS = 
      "tez.task.merge.progress.records";
  public static final long DEFAULT_RECORDS_BEFORE_PROGRESS = 10000; 

  /**
   * 
   */
  public static final String LOCAL_DIR = "tez.engine.local.dir";
  public static final String DEFAULT_LOCAL_DIR = "/tmp";

  /**
   * 
   */
  public static final String TEZ_ENGINE_TASK_INDEGREE = 
      "tez.engine.task.in-degree";
  public static final int DEFAULT_TEZ_ENGINE_TASK_INDEGREE = 1;

  /**
   * 
   */
  public static final String TEZ_ENGINE_TASK_OUTDEGREE = 
      "tez.engine.task.out-degree";
  public static final int DEFAULT_TEZ_ENGINE_TASK_OUTDEGREE = 1;

  /**
   * 
   */
  public static final String TEZ_ENGINE_IO_SORT_FACTOR = 
      "tez.engine.io.sort.factor";
  public static final int DEFAULT_TEZ_ENGINE_IO_SORT_FACTOR = 100;

  /**
   * 
   */
  public static final String TEZ_ENGINE_SORT_SPILL_PERCENT = 
      "tez.engine.sort.spill.percent";
  public static float DEFAULT_TEZ_ENGINE_SORT_SPILL_PERCENT = 0.8f; 

  /**
   * 
   */
  public static final String TEZ_ENGINE_IO_SORT_MB = "tez.engine.io.sort.mb";
  public static final int DEFAULT_TEZ_ENGINE_IO_SORT_MB = 100;

  /**
   * 
   */
  public static final String TEZ_ENGINE_INDEX_CACHE_MEMORY_LIMIT_BYTES = 
      "tez.engine.index.cache.memory.limit.bytes";
  public static final int DEFAULT_TEZ_ENGINE_INDEX_CACHE_MEMORY_LIMIT_BYTES = 
      1024 * 1024;

  /**
   * 
   */
  public static final String TEZ_ENGINE_COMBINE_MIN_SPILLS = 
      "tez.engine.combine.min.spills";
  public static final int  DEFAULT_TEZ_ENGINE_COMBINE_MIN_SPILLS = 3;
  
  /**
   * 
   */
  public static final String TEZ_ENGINE_SORT_THREADS = 
	      "tez.engine.sort.threads";
  public static final int DEFAULT_TEZ_ENGINE_SORT_THREADS = 1;

  /**
   * 
   */
  public static final String COUNTERS_MAX_KEY = "tez.engine.job.counters.max";
  public static final int COUNTERS_MAX_DEFAULT = 120;

  /**
   * 
   */
  public static final String COUNTER_GROUP_NAME_MAX_KEY = "tez.engine.job.counters.group.name.max";
  public static final int COUNTER_GROUP_NAME_MAX_DEFAULT = 128;

  /**
   * 
   */
  public static final String COUNTER_NAME_MAX_KEY = "tez.engine.job.counters.counter.name.max";
  public static final int COUNTER_NAME_MAX_DEFAULT = 64;

  /**
   * 
   */
  public static final String COUNTER_GROUPS_MAX_KEY = "tez.engine.job.counters.groups.max";
  public static final int COUNTER_GROUPS_MAX_DEFAULT = 50;

  
  /**
   * Temporary interface for MR only (not chained Tez) to indicate whether
   * in-memory shuffle should be used.
   */
  @Private
  public static final String TEZ_ENGINE_SHUFFLE_USE_IN_MEMORY =
      "tez.engine.shuffle.use.in-memory";
  public static final boolean DEFAULT_TEZ_ENGINE_SHUFFLE_USE_IN_MEMORY = false;
  
  /**
   * 
   */
  public static final String TEZ_ENGINE_SHUFFLE_PARALLEL_COPIES = 
      "tez.engine.shuffle.parallel.copies";
  public static final int DEFAULT_TEZ_ENGINE_SHUFFLE_PARALLEL_COPIES = 20;

  /**
   * TODO Is this user configurable.
   */
  public static final String TEZ_ENGINE_METRICS_SESSION_ID = 
      "tez.engine.metrics.session.id";
  public static final String DEFAULT_TEZ_ENGINE_METRICS_SESSION_ID = "";

  /**
   * 
   */
  public static final String TEZ_ENGINE_SHUFFLE_FETCH_FAILURES = 
      "tez.engine.shuffle.fetch.failures.limit";
  public final static int DEFAULT_TEZ_ENGINE_SHUFFLE_FETCH_FAILURES_LIMIT = 10;

  /**
   * 
   */
  public static final String TEZ_ENGINE_SHUFFLE_NOTIFY_READERROR = 
      "tez.engine.shuffle.notify.readerror";
  public static final boolean DEFAULT_TEZ_ENGINE_SHUFFLE_NOTIFY_READERROR = true;

  /**
   * 
   */
  public static final String TEZ_ENGINE_SHUFFLE_CONNECT_TIMEOUT = 
      "tez.engine.shuffle.connect.timeout";
  public static final int DEFAULT_TEZ_ENGINE_SHUFFLE_STALLED_COPY_TIMEOUT = 
      3 * 60 * 1000;

  /**
   * 
   */
  public static final String TEZ_ENGINE_SHUFFLE_READ_TIMEOUT = "tez.engine.shuffle.read.timeout";
  public final static int DEFAULT_TEZ_ENGINE_SHUFFLE_READ_TIMEOUT = 
      3 * 60 * 1000;

  /**
   * 
   */
  public static final String TEZ_ENGINE_SHUFFLE_ENABLE_SSL = 
      "tez.engine.shuffle.ssl.enable";
  public static final boolean DEFAULT_TEZ_ENGINE_SHUFFLE_ENABLE_SSL = false;

  /**
   * 
   */
  public static final String TEZ_ENGINE_SHUFFLE_INPUT_BUFFER_PERCENT = 
      "tez.engine.shuffle.input.buffer.percent";
  public static final float DEFAULT_TEZ_ENGINE_SHUFFLE_INPUT_BUFFER_PERCENT =
      0.90f;

  /**
   * 
   */
  public static final String TEZ_ENGINE_SHUFFLE_MEMORY_LIMIT_PERCENT = 
      "tez.engine.shuffle.memory.limit.percent";
  public static final float DEFAULT_TEZ_ENGINE_SHUFFLE_MEMORY_LIMIT_PERCENT = 
      0.25f;

  /**
   * 
   */
  public static final String TEZ_ENGINE_SHUFFLE_MERGE_PERCENT = 
      "tez.engine.shuffle.merge.percent";
  public static final float DEFAULT_TEZ_ENGINE_SHUFFLE_MERGE_PERCENT = 0.90f;
  
  /**
   * TODO TEZAM3 default value ?
   */
  public static final String TEZ_ENGINE_SHUFFLE_MEMTOMEM_SEGMENTS = 
      "tez.engine.shuffle.memory-to-memory.segments";

  /**
   * 
   */
  public static final String TEZ_ENGINE_SHUFFLE_ENABLE_MEMTOMEM = 
      "tez.engine.shuffle.memory-to-memory.enable";
  public static final boolean DEFAULT_TEZ_ENGINE_SHUFFLE_ENABLE_MEMTOMEM = 
      false;

  /**
   * 
   */
  public static final String TEZ_ENGINE_INPUT_BUFFER_PERCENT = 
      "tez.engine.task.input.buffer.percent";
  public static final float DEFAULT_TEZ_ENGINE_INPUT_BUFFER_PERCENT = 0.0f;
}
