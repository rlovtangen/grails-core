/*
 * Copyright 2004-2005 the original author or authors.
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
package org.grails.core.util;

import org.springframework.util.ConcurrentReferenceHashMap;

import java.util.Map;


/**
 * Creates a InheritableThreadLocal with an intial value of a Map.
 *
 * @author Graeme Rocher
 * @since 0.6
 *
 * @deprecated Do not use
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
@Deprecated
public class SoftThreadLocalMap extends InheritableThreadLocal<Map> {

    /**
     * Creates an initial value of a Map.
     */
    @Override
    protected Map initialValue() {
        return new ConcurrentReferenceHashMap();
    }
}
