/*
 * Copyright 2024 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.nowinandroid


import com.android.build.gradle.internal.services.ServiceRegistrationAction
import org.gradle.api.Project
import org.gradle.api.services.BuildService
import org.gradle.api.services.BuildServiceParameters
import org.gradle.api.services.BuildServiceParameters.None

abstract class KotlinCompileBuildService: BuildService<BuildServiceParameters.None> {
    class RegistrationAction(project: Project, maxParallelUsages: Int?) :
        ServiceRegistrationAction<KotlinCompileBuildService, None>(
            project,
            KotlinCompileBuildService::class.java,
            maxParallelUsages ?: DEFAULT_INSTANCE_POOL_SIZE
        ) {
        override fun configure(parameters: BuildServiceParameters.None) {
            // do nothing
        }
    }
}

private const val DEFAULT_INSTANCE_POOL_SIZE = 1
