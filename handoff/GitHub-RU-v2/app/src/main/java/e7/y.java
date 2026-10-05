package e7;

import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* loaded from: /home/user/work/p/classes.dex */
public final class y implements View.OnKeyListener {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SeekBarPreference f22053r;

    public y(SeekBarPreference seekBarPreference) {
        this.f22053r = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SeekBar seekBar;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        SeekBarPreference seekBarPreference = this.f22053r;
        if ((!seekBarPreference.f3017m0 && (i == 21 || i == 22)) || i == 23 || i == 66 || (seekBar = seekBarPreference.f3015k0) == null) {
            return false;
        }
        return seekBar.onKeyDown(i, keyEvent);
    }
}
