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

package org.apache.shardingsphere.test.integration.engine.junit;

import org.junit.runner.Runner;
import org.junit.runners.model.InitializationError;
import org.junit.runners.parameterized.ParametersRunnerFactory;
import org.junit.runners.parameterized.TestWithParameters;

/**
 * A {@code ParameterizedRunnerFactory} creates a runner for a single
 * {@link TestWithParameters}.
 */
public final class ITRunnerWithParametersFactory implements ParametersRunnerFactory {
    
    /**
     * Returns a runner for the specified {@link TestWithParameters}.
     *
     * @param test test with parameters
     * @return runner runner
     * @throws InitializationError
     *             if the runner could not be created.
     */
    public Runner createRunnerForTestWithParameters(final TestWithParameters test) throws InitializationError {
        return new ITBlockJUnit4ClassRunnerWithParameters(test);
    }
}
