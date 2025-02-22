/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.solr.schema;
import org.apache.lucene.search.Query;
import org.apache.solr.search.QParser;
import org.apache.solr.search.SpatialOptions;


/**
 * Indicate that the implementing class is capable of generating a Query against spatial resources.
 * For example, the {@link LatLonPointSpatialField} is capable of creating a query that restricts the document space down
 * to documents that are within a certain distance of a given point on Earth. *
 *
 **/
public interface SpatialQueryable {

  public Query createSpatialQuery(QParser parser, SpatialOptions options);

  public double getSphereRadius();
}
