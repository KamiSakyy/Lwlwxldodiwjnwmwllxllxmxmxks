package com.google.android.material.datepicker;

import a5.c1;
import a5.q2;
import a5.r2;
import a5.t0;
import a5.t2;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.a0;
import b6.a2;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: /home/user/work/p/classes4.dex */
public class MaterialDatePicker<S> extends DialogFragment {
    public LinkedHashSet J0;
    public LinkedHashSet K0;
    public int L0;
    public PickerFragment M0;
    public b N0;
    public MaterialCalendar O0;
    public int P0;
    public CharSequence Q0;
    public boolean R0;
    public int S0;
    public int T0;
    public CharSequence U0;
    public int V0;
    public CharSequence W0;
    public int X0;
    public CharSequence Y0;
    public int Z0;
    public CharSequence a1;
    public TextView b1;
    public CheckableImageButton c1;
    public u31.j d1;
    public boolean e1;
    public CharSequence f1;
    public CharSequence g1;

    public MaterialDatePicker() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.J0 = new LinkedHashSet();
        this.K0 = new LinkedHashSet();
    }

    public static int B4(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(2131166109);
        Calendar b = t.b();
        b.set(5, 1);
        Calendar a = t.a(b);
        a.get(2);
        a.get(1);
        int maximum = a.getMaximum(7);
        a.getActualMaximum(5);
        a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(2131166115) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(2131166129)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean C4(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b4.e0(2130969465, context, MaterialCalendar.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public final void A4() {
        if (((a0) this).x.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    public final void P3(Bundle bundle) {
        super.P3(bundle);
        if (bundle == null) {
            bundle = ((a0) this).x;
        }
        this.L0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.N0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.P0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.Q0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.S0 = bundle.getInt("INPUT_MODE_KEY");
        this.T0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.U0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.V0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.W0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.X0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.Y0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.Z0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.a1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.Q0;
        if (charSequence == null) {
            charSequence = i4().getResources().getText(this.P0);
        }
        this.f1 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.g1 = charSequence;
    }

    public final View R3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.R0 ? 2131559331 : 2131559330, viewGroup);
        Context context = inflate.getContext();
        if (this.R0) {
            inflate.findViewById(2131363051).setLayoutParams(new LinearLayout.LayoutParams(B4(context), -2));
        } else {
            inflate.findViewById(2131363052).setLayoutParams(new LinearLayout.LayoutParams(B4(context), -1));
        }
        ((TextView) inflate.findViewById(2131363063)).setAccessibilityLiveRegion(1);
        this.c1 = (CheckableImageButton) inflate.findViewById(2131363065);
        this.b1 = (TextView) inflate.findViewById(2131363069);
        this.c1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.c1;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, w8.s.o(context, 2131231554));
        stateListDrawable.addState(new int[0], w8.s.o(context, 2131231556));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.c1.setChecked(this.S0 != 0);
        c1.p(this.c1, (a5.b) null);
        q.u uVar = this.c1;
        this.c1.setContentDescription(this.S0 == 1 ? uVar.getContext().getString(2131953298) : uVar.getContext().getString(2131953300));
        this.c1.setOnClickListener(new com.github.rudroid.actions.checklog.c(8, this));
        A4();
        throw null;
    }

    public final void Z3(Bundle bundle) {
        super.Z3(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.L0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.N0;
        a aVar = new a();
        int i = a.b;
        int i2 = a.b;
        long j = bVar.r.w;
        long j2 = bVar.s.w;
        aVar.a = Long.valueOf(bVar.u.w);
        int i3 = bVar.v;
        d dVar = bVar.t;
        MaterialCalendar materialCalendar = this.O0;
        m mVar = materialCalendar == null ? null : materialCalendar.w0;
        if (mVar != null) {
            aVar.a = Long.valueOf(mVar.w);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dVar);
        m h = m.h(j);
        m h2 = m.h(j2);
        d dVar2 = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = aVar.a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(h, h2, dVar2, l == null ? null : m.h(l.longValue()), i3));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.P0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.Q0);
        bundle.putInt("INPUT_MODE_KEY", this.S0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.T0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.U0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.V0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.W0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.X0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.Y0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.Z0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.a1);
    }

    public final void a4() {
        super.a4();
        Window window = w4().getWindow();
        if (this.R0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.d1);
            if (!this.e1) {
                View findViewById = k4().findViewById(2131362369);
                ColorStateList c = a2.c(findViewById.getBackground());
                Integer valueOf = c != null ? Integer.valueOf(c.getDefaultColor()) : null;
                boolean z = false;
                boolean z2 = valueOf == null || valueOf.intValue() == 0;
                int m = a.a.m(R.attr.colorBackground, -16777216, window.getContext());
                if (z2) {
                    valueOf = Integer.valueOf(m);
                }
                b4.g0(window, false);
                window.getContext();
                Context context = window.getContext();
                int i = Build.VERSION.SDK_INT;
                int f = i < 27 ? r4.a.f(a.a.m(R.attr.navigationBarColor, -16777216, context), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(f);
                boolean z3 = a.a.o(0) || a.a.o(valueOf.intValue());
                y51.c cVar = new y51.c(window.getDecorView());
                (i >= 35 ? new t2(window, cVar) : i >= 30 ? new r2(window, cVar) : new q2(window, cVar)).W(z3);
                boolean o = a.a.o(m);
                if (a.a.o(f) || (f == 0 && o)) {
                    z = true;
                }
                y51.c cVar2 = new y51.c(window.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new t2(window, cVar2) : i2 >= 30 ? new r2(window, cVar2) : new q2(window, cVar2)).V(z);
                l lVar = new l(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight());
                WeakHashMap weakHashMap = c1.a;
                t0.m(findViewById, lVar);
                this.e1 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = B3().getDimensionPixelOffset(2131166117);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.d1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new k31.a(w4(), rect));
        }
        i4();
        int i3 = this.L0;
        if (i3 == 0) {
            A4();
            throw null;
        }
        A4();
        b bVar = this.N0;
        MaterialCalendar materialCalendar = new MaterialCalendar();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i3);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.u);
        materialCalendar.n4(bundle);
        this.O0 = materialCalendar;
        PickerFragment pickerFragment = materialCalendar;
        if (this.S0 == 1) {
            A4();
            b bVar2 = this.N0;
            PickerFragment materialTextInputPicker = new MaterialTextInputPicker();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i3);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            materialTextInputPicker.n4(bundle2);
            pickerFragment = materialTextInputPicker;
        }
        this.M0 = pickerFragment;
        this.b1.setText((this.S0 == 1 && B3().getConfiguration().orientation == 2) ? this.g1 : this.f1);
        A4();
        throw null;
    }

    public final void b4() {
        this.M0.t0.clear();
        super.b4();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.J0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.K0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) ((a0) this).a0;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final Dialog v4() {
        Context i4 = i4();
        i4();
        int i = this.L0;
        if (i == 0) {
            A4();
            throw null;
        }
        Dialog dialog = new Dialog(i4, i);
        Context context = dialog.getContext();
        this.R0 = C4(context, R.attr.windowFullscreen);
        this.d1 = new u31.j(context, null, 2130969465, 2132018489);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, x21.a.t, 2130969465, 2132018489);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.d1.m(context);
        this.d1.q(ColorStateList.valueOf(color));
        this.d1.p(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public static Object i4(Object... a) {
        return null;
    }

    public static Object w4(Object... a) {
        return null;
    }

    public static Object k4(Object... a) {
        return null;
    }

    public static Object B3(Object... a) {
        return null;
    }
}
