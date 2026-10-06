package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import android.widget.TextView;
import e7.v;
import e7.w;
import e7.x;
import e7.y;
import e7.z;

/* loaded from: /home/user/work/p/classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: f0, reason: collision with root package name */
    public int f3010f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f3011g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f3012h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f3013i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f3014j0;

    /* renamed from: k0, reason: collision with root package name */
    public SeekBar f3015k0;

    /* renamed from: l0, reason: collision with root package name */
    public TextView f3016l0;

    /* renamed from: m0, reason: collision with root package name */
    public final boolean f3017m0;

    /* renamed from: n0, reason: collision with root package name */
    public final boolean f3018n0;

    /* renamed from: o0, reason: collision with root package name */
    public final boolean f3019o0;

    /* renamed from: p0, reason: collision with root package name */
    public final x f3020p0;

    /* renamed from: q0, reason: collision with root package name */
    public final y f3021q0;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969716, 0);
        this.f3020p0 = new x(this);
        this.f3021q0 = new y(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.f22051k, 2130969716, 0);
        this.f3011g0 = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i10 = this.f3011g0;
        i = i < i10 ? i10 : i;
        if (i != this.f3012h0) {
            this.f3012h0 = i;
            j();
        }
        int i11 = obtainStyledAttributes.getInt(4, 0);
        if (i11 != this.f3013i0) {
            this.f3013i0 = Math.min(this.f3012h0 - this.f3011g0, Math.abs(i11));
            j();
        }
        this.f3017m0 = obtainStyledAttributes.getBoolean(2, true);
        this.f3018n0 = obtainStyledAttributes.getBoolean(5, false);
        this.f3019o0 = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    public final void H(int i, boolean z10) {
        int i10 = this.f3011g0;
        if (i < i10) {
            i = i10;
        }
        int i11 = this.f3012h0;
        if (i > i11) {
            i = i11;
        }
        if (i != this.f3010f0) {
            this.f3010f0 = i;
            TextView textView = this.f3016l0;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (F()) {
                int i12 = ~i;
                if (F()) {
                    i12 = this.f2986s.d().getInt(this.C, i12);
                }
                if (i != i12) {
                    SharedPreferences.Editor c10 = this.f2986s.c();
                    c10.putInt(this.C, i);
                    if (!this.f2986s.f22025a) {
                        c10.apply();
                    }
                }
            }
            if (z10) {
                j();
            }
        }
    }

    public final void I(SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.f3011g0;
        if (progress != this.f3010f0) {
            c(Integer.valueOf(progress));
            H(progress, false);
        }
    }

    @Override // androidx.preference.Preference
    public final void n(v vVar) {
        super.n(vVar);
        vVar.f28209a.setOnKeyListener(this.f3021q0);
        this.f3015k0 = (SeekBar) vVar.y(2131363305);
        TextView textView = (TextView) vVar.y(2131363306);
        this.f3016l0 = textView;
        if (this.f3018n0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f3016l0 = null;
        }
        SeekBar seekBar = this.f3015k0;
        if (seekBar == null) {
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f3020p0);
        this.f3015k0.setMax(this.f3012h0 - this.f3011g0);
        int i = this.f3013i0;
        if (i != 0) {
            this.f3015k0.setKeyProgressIncrement(i);
        } else {
            this.f3013i0 = this.f3015k0.getKeyProgressIncrement();
        }
        this.f3015k0.setProgress(this.f3010f0 - this.f3011g0);
        int i10 = this.f3010f0;
        TextView textView2 = this.f3016l0;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i10));
        }
        this.f3015k0.setEnabled(i());
    }

    @Override // androidx.preference.Preference
    public final Object q(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    public final void r(Parcelable parcelable) {
        if (!parcelable.getClass().equals(z.class)) {
            super.r(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        super.r(zVar.getSuperState());
        this.f3010f0 = zVar.f22054r;
        this.f3011g0 = zVar.f22055s;
        this.f3012h0 = zVar.f22056t;
        j();
    }

    @Override // androidx.preference.Preference
    public final Parcelable s() {
        super.s();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.J) {
            return absSavedState;
        }
        z zVar = new z();
        zVar.f22054r = this.f3010f0;
        zVar.f22055s = this.f3011g0;
        zVar.f22056t = this.f3012h0;
        return zVar;
    }

    @Override // androidx.preference.Preference
    public final void t(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int intValue = ((Integer) obj).intValue();
        if (F()) {
            intValue = this.f2986s.d().getInt(this.C, intValue);
        }
        H(intValue, true);
    }

    public Object f2986s;

    public Object C;

    public Object J;
}
