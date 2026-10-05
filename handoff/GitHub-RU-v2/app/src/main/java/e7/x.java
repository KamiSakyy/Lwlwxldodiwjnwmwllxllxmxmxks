package e7;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;

/* loaded from: /home/user/work/p/classes.dex */
public final class x implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SeekBarPreference f22052a;

    public x(SeekBarPreference seekBarPreference) {
        this.f22052a = seekBarPreference;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z10) {
        SeekBarPreference seekBarPreference = this.f22052a;
        if (z10 && (seekBarPreference.f3019o0 || !seekBarPreference.f3014j0)) {
            seekBarPreference.I(seekBar);
            return;
        }
        int i10 = i + seekBarPreference.f3011g0;
        TextView textView = seekBarPreference.f3016l0;
        if (textView != null) {
            textView.setText(String.valueOf(i10));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f22052a.f3014j0 = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        SeekBarPreference seekBarPreference = this.f22052a;
        seekBarPreference.f3014j0 = false;
        if (seekBar.getProgress() + seekBarPreference.f3011g0 != seekBarPreference.f3010f0) {
            seekBarPreference.I(seekBar);
        }
    }
}
