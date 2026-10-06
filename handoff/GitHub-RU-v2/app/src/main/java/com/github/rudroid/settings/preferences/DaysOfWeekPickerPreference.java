package com.github.rudroid.settings.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b21.v;
import com.github.rudroid.activities.k0;
import com.github.rudroid.common.f;
import com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.j;
import com.github.rudroid.settings.SettingsNotificationSchedulesFragment;
import com.github.rudroid.settings.j0;
import com.github.rudroid.settings.q;
import gg.b;
import gg.c;
import java.util.ArrayList;
import k71.k;
import l7.n1;
import sy.w;
import w61.p;
import x61.m;

/* loaded from: /home/user/work/p/classes3.dex */
public final class DaysOfWeekPickerPreference extends Preference implements b.a, c.a {
    public static final a Companion = new a();
    public final p f0;
    public j0 g0;

    public static final class a {
    }

    public interface b {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DaysOfWeekPickerPreference(Context context) {
        this(context, null);
        k.g(context, "context");
    }

    @Override // gg.b.a
    public final void a(int i) {
        p pVar = this.f0;
        gg.c cVar = (gg.c) pVar.getValue();
        cVar.getClass();
        f.a aVar = com.github.rudroid.common.f.Companion;
        int intValue = ((Number) cVar.h.get(i)).intValue();
        aVar.getClass();
        com.github.rudroid.common.f a2 = f.a.a(intValue);
        ArrayList arrayList = cVar.i;
        if (!arrayList.contains(a2)) {
            arrayList.add(a2);
        } else if (arrayList.size() == cVar.f) {
            cVar.e.b();
        } else {
            arrayList.remove(a2);
        }
        cVar.o(i);
        j0 j0Var = this.g0;
        if (j0Var != null) {
            j0Var.a.A4().G(m.F0(((gg.c) pVar.getValue()).i));
        }
    }

    @Override // gg.c.a
    public final void b() {
        SettingsNotificationSchedulesFragment settingsNotificationSchedulesFragment;
        k.i w3;
        j0 j0Var = this.g0;
        if (j0Var == null || (w3 = (settingsNotificationSchedulesFragment = j0Var.a).w3()) == null) {
            return;
        }
        v vVar = new v(w3);
        k.d dVar = (k.d) vVar.t;
        dVar.f = dVar.a.getText(2131953599);
        vVar.y(2131953598, new q(settingsNotificationSchedulesFragment, 1));
        vVar.x(settingsNotificationSchedulesFragment.C3(2131951840), new k0(15));
        vVar.A();
    }

    public final void n(e7.v vVar) {
        super.n(vVar);
        View view = ((n1) vVar).a;
        RecyclerView findViewById = view.findViewById(2131362206);
        findViewById.setAdapter((gg.c) this.f0.getValue());
        view.getContext();
        findViewById.setLayoutManager(new LinearLayoutManager(1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DaysOfWeekPickerPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969661);
        k.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DaysOfWeekPickerPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        k.g(context, "context");
        this.f0 = w.t(new j(16, this));
    }

    public static Object D(Object... a) {
        return null;
    }
}
