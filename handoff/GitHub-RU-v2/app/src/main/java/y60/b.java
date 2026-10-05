package y60;

import aa.i0;
import aa.j0;
import aa.p0;
import aa.w;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import bm.k;
import c21.h0;
import com.github.domain.discussions.data.DiscussionCategoryData;
import com.github.domain.searchandfilter.filters.data.DiscussionCategoryFilter;
import com.github.domain.searchandfilter.filters.data.d;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.q7;
import com.google.android.gms.internal.measurement.z6;
import com.google.android.gms.measurement.internal.c0;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.x;
import e7.m;
import ea.f;
import hc0.sf;
import java.util.Iterator;
import java.util.List;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public class b implements i0, k, g, x, m {
    public static final /* synthetic */ b s = new b(2);
    public static final /* synthetic */ b t = new b(3);
    public static final /* synthetic */ b u = new b(4);
    public static final /* synthetic */ b v = new b(5);
    public static b w;
    public final /* synthetic */ int r;

    public /* synthetic */ b(int i) {
        this.r = i;
    }

    public static final boolean b(k91.a aVar) {
        Iterator it = aVar.a().iterator();
        int i = 0;
        boolean z = false;
        while (it.hasNext()) {
            h0 h0Var = ((k91.a) it.next()).a;
            if (k71.k.b(h0Var, j91.a.T)) {
                i++;
            } else {
                if (k71.k.b(h0Var, j91.a.d0) ? true : k71.k.b(h0Var, j91.a.g0) ? true : k71.k.b(h0Var, j91.a.q0)) {
                    continue;
                } else {
                    if (z && i > 1) {
                        return true;
                    }
                    i = 0;
                    z = true;
                }
            }
        }
        return false;
    }

    public CharSequence a(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        CharSequence[] charSequenceArr = listPreference.l0;
        int H = listPreference.H(listPreference.n0);
        if (TextUtils.isEmpty((H < 0 || charSequenceArr == null) ? null : charSequenceArr[H])) {
            return ((Preference) listPreference).r.getString(2131953323);
        }
        int H2 = listPreference.H(listPreference.n0);
        if (H2 < 0 || charSequenceArr == null) {
            return null;
        }
        return charSequenceArr[H2];
    }

    public Object c() {
        switch (this.r) {
            case 3:
                List list = c0.a;
                z6.s.a();
                Long l = (Long) b7.Q.b();
                l.getClass();
                return l;
            case 4:
                List list2 = c0.a;
                z6.s.a();
                return Integer.valueOf((int) ((Long) b7.d.b()).longValue());
            default:
                List list3 = c0.a;
                Boolean bool = (Boolean) q7.b.b();
                bool.getClass();
                return bool;
        }
    }

    public aa.m d() {
        sf.Companion.getClass();
        j0 j0Var = sf.a;
        k71.k.g(j0Var, "type");
        List list = z60.a.a;
        List list2 = z60.a.a;
        k71.k.g(list2, "selections");
        r rVar = r.r;
        return new aa.m("data", j0Var, (String) null, rVar, rVar, list2);
    }

    public /* synthetic */ String e(String str, String str2) {
        return null;
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == b.class;
            default:
                return super.equals(obj);
        }
    }

    public Signature[] f(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public p0 g() {
        return aa.c.c(c.a, true);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.x.a(b.class).hashCode();
            default:
                return super.hashCode();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0019, code lost:
    
        if (r5 == null) goto L5;
     */
    @Override // bm.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d l(String str) {
        List list;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            list = (List) bVar.a(str, new k81.d(DiscussionCategoryData.Companion.serializer(), 0));
        }
        list = r.r;
        return new DiscussionCategoryFilter(list);
    }

    public void o(f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }



}
