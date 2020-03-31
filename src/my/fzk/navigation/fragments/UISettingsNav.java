package my.fzk.navigation.fragments;

import android.os.Bundle;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

import com.android.internal.logging.nano.MetricsProto.MetricsEvent;

public class UISettingsNav extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        addPreferencesFromResource(R.xml.fzk_nav_ui_settings);
    }

	@Override
    public int getMetricsCategory() {
        return MetricsEvent.RESURRECTED;
    }
}
