/*
 * Copyright (C) 2018 The Pure Android Project
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

package com.android.settings.notification;

import static com.android.settings.notification.SettingPref.TYPE_SYSTEM;

import android.content.Context;

import android.provider.Settings.System;
import com.android.settings.SettingsPreferenceFragment;
import com.android.settingslib.core.lifecycle.Lifecycle;

public class VolumeAdjustmentTonePreferenceController extends SettingPrefController {

    private static final String KEY_VOLUME_ADJUST_SOUNDS = "volume_adjust_sounds";

    public VolumeAdjustmentTonePreferenceController(Context context, SettingsPreferenceFragment parent,
            Lifecycle lifecycle) {
        super(context, parent, lifecycle);
        mPreference = new SettingPref(
            TYPE_SYSTEM, KEY_VOLUME_ADJUST_SOUNDS, System.VOLUME_ADJUST_SOUNDS_ENABLED, 0);
    }

}
