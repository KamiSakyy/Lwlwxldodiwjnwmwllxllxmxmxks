package w80;

import com.github.domain.searchandfilter.filters.data.AuthorFilter;
import com.github.domain.searchandfilter.filters.data.SpokenLanguageFilter;
import com.github.service.models.response.SpokenLanguage;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.p9;
import com.google.android.gms.internal.measurement.z6;
import hc0.lk;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 implements aa.i0, bm.k, com.google.android.gms.measurement.internal.x, e51.b, t6.b {
    public static final /* synthetic */ a0 s = new a0(3);
    public static final /* synthetic */ a0 t = new a0(4);
    public static final /* synthetic */ a0 u = new a0(5);
    public static a0 v;
    public final /* synthetic */ int r;

    public /* synthetic */ a0(int i) {
        this.r = i;
    }

    public Object c() {
        switch (this.r) {
            case 3:
                List list = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                return Integer.valueOf((int) ((Long) b7.O.b()).longValue());
            case 4:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                return Integer.valueOf((int) ((Long) b7.s.b()).longValue());
            default:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                Boolean bool = (Boolean) p9.a.b();
                bool.getClass();
                return bool;
        }
    }

    public aa.m d() {
        lk.Companion.getClass();
        aa.q0 q0Var = lk.J;
        k71.k.g(q0Var, "type");
        List list = x80.c.a;
        List list2 = x80.c.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == a0.class;
            default:
                return super.equals(obj);
        }
    }

    public aa.p0 g() {
        return aa.c.c(d0.a, true);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.x.a(a0.class).hashCode();
            default:
                return super.hashCode();
        }
    }

    public StackTraceElement[] k(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // bm.k
    public com.github.domain.searchandfilter.filters.data.d l(String str) {
        yz0.f fVar;
        SpokenLanguage spokenLanguage;
        switch (this.r) {
            case 1:
                com.github.domain.database.serialization.a.Companion.getClass();
                if (str != null) {
                    l81.n nVar = com.github.domain.database.serialization.a.b;
                    fVar = (yz0.f) nVar.a(str, m71.a.z(b91.g.C(((l81.c) nVar).b, k71.x.a(yz0.f.class))));
                } else {
                    fVar = null;
                }
                return new AuthorFilter(fVar);
            default:
                if (str != null) {
                    l81.b bVar = l81.c.d;
                    bVar.getClass();
                    spokenLanguage = (SpokenLanguage) bVar.a(str, SpokenLanguage.Companion.serializer());
                } else {
                    spokenLanguage = null;
                }
                return new SpokenLanguageFilter(spokenLanguage);
        }
    }

    public void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
    public Object a(Object p1) { return null; }
}
