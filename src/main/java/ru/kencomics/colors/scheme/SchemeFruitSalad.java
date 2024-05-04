/*
 * Copyright 2023 Google LLC
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
package ru.kencomics.colors.scheme;

import ru.kencomics.colors.dynamiccolor.DynamicScheme;
import ru.kencomics.colors.dynamiccolor.Variant;
import ru.kencomics.colors.hct.Hct;
import ru.kencomics.colors.palettes.TonalPalette;
import ru.kencomics.colors.utils.MathUtils;

/**
 * A playful theme - the source color's hue does not appear in the theme.
 */
public class SchemeFruitSalad extends DynamicScheme {
    public SchemeFruitSalad(Hct sourceColorHct, boolean isDark, double contrastLevel) {
        super(
                sourceColorHct,
                Variant.FRUIT_SALAD,
                isDark,
                contrastLevel,
                TonalPalette.fromHueAndChroma(
                        MathUtils.sanitizeDegreesDouble(sourceColorHct.getHue() - 50.0), 48.0),
                TonalPalette.fromHueAndChroma(
                        MathUtils.sanitizeDegreesDouble(sourceColorHct.getHue() - 50.0), 36.0),
                TonalPalette.fromHueAndChroma(sourceColorHct.getHue(), 36.0),
                TonalPalette.fromHueAndChroma(sourceColorHct.getHue(), 10.0),
                TonalPalette.fromHueAndChroma(sourceColorHct.getHue(), 16.0));
    }
}