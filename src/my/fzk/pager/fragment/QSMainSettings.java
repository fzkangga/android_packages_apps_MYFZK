package my.fzk.pager.fragment;

import android.os.Bundle;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

import com.android.internal.logging.nano.MetricsProto.MetricsEvent;

public class QSMainSettings extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        addPreferencesFromResource(R.xml.fzk_qsmain);
    }

	@Override
    public int getMetricsCategory() {
        return MetricsEvent.RESURRECTED;
    }
}
