package w80;

import android.os.Looper;
import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.github.domain.searchandfilter.filters.data.CustomInstructionsFilter;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.q7;
import com.google.android.gms.internal.measurement.z6;
import hc0.ap;
import java.util.Arrays;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w3 implements aa.i0, bm.k, com.google.android.gms.measurement.internal.x, e7.m, l7.s1 {
    public static final /* synthetic */ w3 s = new w3(3);
    public static final /* synthetic */ w3 t = new w3(4);
    public static final /* synthetic */ w3 u = new w3(5);
    public static w3 v;
    public final /* synthetic */ int r;

    public /* synthetic */ w3(int i) {
        this.r = i;
    }

    public static final t91.c b(t91.c cVar, int i, char c, boolean z, int i2) {
        t91.c cVar2 = t91.c.e;
        int[] iArr = cVar.a;
        int length = iArr.length;
        int i3 = length + 1;
        int[] copyOf = Arrays.copyOf(iArr, i3);
        k71.k.f(copyOf, "copyOf(...)");
        char[] copyOf2 = Arrays.copyOf(cVar.b, i3);
        k71.k.f(copyOf2, "copyOf(...)");
        boolean[] copyOf3 = Arrays.copyOf(cVar.c, i3);
        k71.k.f(copyOf3, "copyOf(...)");
        copyOf[length] = cVar.g() + i;
        copyOf2[length] = c;
        copyOf3[length] = z;
        return cVar.d(copyOf, copyOf2, copyOf3, i2);
    }

    public static final boolean e() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public CharSequence a(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        return TextUtils.isEmpty(editTextPreference.l0) ? ((Preference) editTextPreference).r.getString(2131953323) : editTextPreference.l0;
    }

    public Object c() {
        switch (this.r) {
            case 3:
                List list = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                Long l = (Long) b7.R.b();
                l.getClass();
                return l;
            case 4:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                return Integer.valueOf((int) ((Long) b7.q.b()).longValue());
            default:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                Boolean bool = (Boolean) q7.a.b();
                bool.getClass();
                return bool;
        }
    }

    public aa.m d() {
        ap.Companion.getClass();
        aa.q0 q0Var = ap.k0;
        k71.k.g(q0Var, "type");
        List list = x80.m.a;
        List list2 = x80.m.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == w3.class;
            default:
                return super.equals(obj);
        }
    }

    public aa.p0 g() {
        return aa.c.c(z3.a, false);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.x.a(w3.class).hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // bm.k
    public com.github.domain.searchandfilter.filters.data.d l(String str) {
        if (str == null) {
            return null;
        }
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return (CustomInstructionsFilter) bVar.a(str, CustomInstructionsFilter.Companion.serializer());
    }

    public long n(long j) {
        return j;
    }

    public void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
