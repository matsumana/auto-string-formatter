/*
 * Copyright (C) 2016 Masahiro Ide
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.imasahiro.stringformatter.processor.benchmark;

import com.github.imasahiro.stringformatter.annotation.AutoStringFormatter;
import com.github.imasahiro.stringformatter.annotation.Format;

/**
 * Formatter definition for integer to string formatting.
 */
public final class AllTypesBenchFormatter {
    public static final String FORMAT = "Benchmark - %s %s %s %s %s %s %s %s";

    private AllTypesBenchFormatter() {}

    @AutoStringFormatter
    interface Formatter {
        @Format(FORMAT)
        String format(
                boolean b, char c, double d, float f, int i, long lng, Object obj, String str);
    }
}
