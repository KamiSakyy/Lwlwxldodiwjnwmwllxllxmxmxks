package com.github.rudroid.settings;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.res.Configuration;
import android.os.Build;
import android.text.format.DateFormat;
import android.view.View;
import android.view.Window;
import android.widget.TimePicker;
import androidx.fragment.app.DialogFragment;
import java.util.Calendar;

/* loaded from: /home/user/work/p/classes3.dex */
public final class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {
    public static final a Companion = new a();
    public TimePickerDialog.OnTimeSetListener J0;
    public Integer K0;
    public Integer L0;

    public static final class a {
    }

    public final void a4() {
        Window window;
        super.a4();
        Dialog dialog = ((DialogFragment) this).E0;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        View decorView = window.getDecorView();
        k71.k.f(decorView, "getDecorView(...)");
        di.c.a(decorView);
        y51.c cVar = new y51.c(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new a5.t2(window, cVar) : i >= 30 ? new a5.r2(window, cVar) : new a5.q2(window, cVar)).V(true);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        k71.k.g(configuration, "newConfig");
        ((androidx.fragment.app.a0) this).Y = true;
        t4(false, false);
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        TimePickerDialog.OnTimeSetListener onTimeSetListener = this.J0;
        if (onTimeSetListener != null) {
            onTimeSetListener.onTimeSet(timePicker, i, i2);
        }
    }

    public final Dialog v4() {
        Calendar calendar = Calendar.getInstance();
        Integer num = this.K0;
        Integer num2 = this.L0;
        if (num != null && num2 != null) {
            calendar.set(11, num.intValue());
            calendar.set(12, num2.intValue());
        }
        k71.k.d(calendar);
        TimePickerDialog timePickerDialog = new TimePickerDialog(w3(), 2132018138, this, calendar.get(11), calendar.get(12), DateFormat.is24HourFormat(y3()));
        timePickerDialog.setTitle((CharSequence) null);
        return timePickerDialog;
    }

    public static  t4(Object... a) {
        return null;
    }

    public static  w3(Object... a) {
        return null;
    }

    public static  y3(Object... a) {
        return null;
    }
}
