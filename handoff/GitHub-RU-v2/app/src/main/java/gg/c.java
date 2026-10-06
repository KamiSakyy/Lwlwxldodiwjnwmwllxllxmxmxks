package gg;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import b5.e;
import com.github.rudroid.common.f;
import com.github.rudroid.utilities.t;
import gg.b;
import ic.fh;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import k71.k;
import l7.m0;
import l7.n1;
import t71.p;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c extends m0 {
    public final b.a d;
    public final a e;
    public final int f = 1;
    public final Calendar g;
    public final ArrayList h;
    public final ArrayList i;

    public interface a {
        void b();
    }

    public c(b.a aVar, a aVar2) {
        this.d = aVar;
        this.e = aVar2;
        Calendar calendar = Calendar.getInstance();
        this.g = calendar;
        k.f(calendar, "calendar");
        this.h = t.a(calendar);
        this.i = new ArrayList();
    }

    public final int k() {
        return 7;
    }

    public final void v(n1 n1Var, int i) {
        b bVar = (b) n1Var;
        e eVar = bVar.x;
        Calendar calendar = this.g;
        k.f(calendar, "calendar");
        ArrayList arrayList = this.h;
        int intValue = ((Number) arrayList.get(i)).intValue();
        f.a aVar = f.Companion;
        int intValue2 = ((Number) arrayList.get(i)).intValue();
        aVar.getClass();
        boolean contains = this.i.contains(f.a.a(intValue2));
        fh fhVar = bVar.u;
        calendar.set(7, intValue);
        String displayName = calendar.getDisplayName(7, 2, Locale.getDefault());
        if (displayName == null) {
            displayName = "";
        }
        r71.e[] eVarArr = b.y;
        eVar.d(displayName, eVarArr[0]);
        TextView textView = fhVar.P;
        textView.setContentDescription((String) eVar.a(bVar, eVarArr[0]));
        String str = (String) eVar.a(bVar, eVarArr[0]);
        if (p.T(str)) {
            return;
        }
        textView.setText(str);
        textView.setContentDescription(str);
        fhVar.N.setChecked(contains);
    }

    public final n1 w(ViewGroup viewGroup, int i) {
        fh b = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559347, viewGroup, false, k5.b.b);
        k.f(b, "inflate(...)");
        return new b(b, this.d);
    }
}
