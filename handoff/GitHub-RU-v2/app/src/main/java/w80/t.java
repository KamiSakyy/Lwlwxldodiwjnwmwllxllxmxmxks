package w80;

import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import com.github.domain.searchandfilter.filters.data.AssigneeFilter;
import com.github.domain.searchandfilter.filters.data.SortFilter;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.j8;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.m9;
import com.google.android.gms.internal.measurement.z6;
import hc0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t implements aa.i0, bm.k, com.google.android.gms.measurement.internal.x, k3.x, t41.a {
    public static final /* synthetic */ t s = new t(3);
    public static final /* synthetic */ t t = new t(4);
    public static final /* synthetic */ t u = new t(5);
    public final /* synthetic */ int r;

    public /* synthetic */ t(int i) {
        this.r = i;
    }

    public static final String e(h91.kShadow kVar, h91.kShadow[] kVarArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        h91.kShadow kVar2 = d91.a.b;
        int d = kVar.d();
        int i5 = 0;
        while (i5 < d) {
            int i6 = (i5 + d) / 2;
            while (i6 > -1 && kVar.i(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (kVar.i(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i11 = i;
            boolean z2 = false;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte i14 = kVarArr[i11].i(i12);
                    byte[] bArr = r81.e.a;
                    int i15 = i14 & 255;
                    z = z2;
                    i3 = i15;
                }
                byte i16 = kVar.i(i7 + i13);
                byte[] bArr2 = r81.e.a;
                i4 = i3 - (i16 & 255);
                if (i4 != 0) {
                    break;
                }
                i13++;
                i12++;
                if (i13 == i9) {
                    break;
                }
                if (kVarArr[i11].d() != i12) {
                    z2 = z;
                } else {
                    if (i11 == kVarArr.length - 1) {
                        break;
                    }
                    i11++;
                    i12 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i17 = i9 - i13;
                    int d2 = kVarArr[i11].d() - i12;
                    int length = kVarArr.length;
                    for (int i18 = i11 + 1; i18 < length; i18++) {
                        d2 += kVarArr[i18].d();
                    }
                    if (d2 >= i17) {
                        if (d2 <= i17) {
                            return kVar.o(i7, i9 + i7).n(t71.a.a);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            d = i6;
        }
        return null;
    }

    public static Typeface f(String str, k3.s sVar, int i) {
        if (i == 0 && k71.k.b(sVar, k3.s.w) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int k = a.a.k(sVar, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(k) : Typeface.create(str, k);
    }

    public Typeface a(k3.s sVar, int i) {
        return f(null, sVar, i);
    }

    public Typeface b(k3.u uVar, k3.s sVar, int i) {
        String str = uVar.u;
        int i2 = sVar.r / 100;
        if (i2 >= 0 && i2 < 2) {
            str = str.concat("-thin");
        } else if (2 <= i2 && i2 < 4) {
            str = str.concat("-light");
        } else if (i2 != 4) {
            if (i2 == 5) {
                str = str.concat("-medium");
            } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                str = str.concat("-black");
            }
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface f = f(str, sVar, i);
            if (!k71.k.b(f, Typeface.create(Typeface.DEFAULT, a.a.k(sVar, i))) && !k71.k.b(f, f(null, sVar, i))) {
                typeface = f;
            }
        }
        return typeface == null ? f(uVar.u, sVar, i) : typeface;
    }

    public Object c() {
        switch (this.r) {
            case 3:
                List list = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                return Integer.valueOf((int) ((Long) b7.P.b()).longValue());
            case 4:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                j8.s.a();
                Double d = (Double) l8.c.b();
                d.getClass();
                return d;
            default:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                Boolean bool = (Boolean) m9.a.b();
                bool.getClass();
                return bool;
        }
    }

    public aa.m d() {
        tb.Companion.getClass();
        aa.q0 q0Var = tb.x;
        k71.k.g(q0Var, "type");
        List list = x80.b.a;
        List list2 = x80.b.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == t.class;
            default:
                return super.equals(obj);
        }
    }

    public aa.p0 g() {
        return aa.c.c(w.a, true);
    }

    public void h(Bundle bundle) {
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.xShadow.a(t.class).hashCode();
            default:
                return super.hashCode();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r6 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r6 == null) goto L7;
     */
    @Override // bm.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.github.domain.searchandfilter.filters.data.d l(String str) {
        List list;
        com.github.rudroid.common.m0 m0Var;
        switch (this.r) {
            case 1:
                com.github.domain.database.serialization.a.Companion.getClass();
                if (str != null) {
                    l81.n nVar = com.github.domain.database.serialization.a.b;
                    list = (List) nVar.a(str, m71.a.z(new k81.d(b91.g.C(((l81.c) nVar).b, k71.xShadow.a(yz0.f.class)), 0)));
                    break;
                }
                list = x61.rShadow.r;
                return new AssigneeFilter(list);
            default:
                if (str != null) {
                    l81.b bVar = l81.c.d;
                    bVar.getClass();
                    m0Var = (com.github.rudroid.common.m0) bVar.a(str, new k81.z("com.github.rudroid.common.SearchFilterSort", com.github.rudroid.common.m0.values()));
                    break;
                }
                m0Var = SortFilter.x;
                return new SortFilter(m0Var);
        }
    }

    public void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
