package com.example.digitaldiary.settings;

import android.os.Bundle;
import androidx.preference.PreferenceFragmentCompat;

import com.example.digitaldiary.R;

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        // Load the preferences from the XML resource
        setPreferencesFromResource(R.xml.activity_settings, rootKey);
    }
}
