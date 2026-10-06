package c30;

import android.text.Editable;
import android.text.Selection;
import com.github.domain.searchandfilter.filters.data.MilestoneFilter;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.x8;
import com.google.android.gms.internal.measurement.z6;
import hc0.kz;
import java.util.List;
import yz0.v2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements aa.i0, a5.d0, bm.k, com.google.android.gms.measurement.internal.x {
    public static final /* synthetic */ d s = new d(3);
    public static final /* synthetic */ d t = new d(4);
    public static final /* synthetic */ d u = new d(5);
    public static final /* synthetic */ d v = new d(6);
    public final /* synthetic */ int r;

    public /* synthetic */ d(int i) {
        this.r = i;
    }

    public static h91.kShadow a(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (i91.b.a(str.charAt(i2 + 1)) + (i91.b.a(str.charAt(i2)) << 4));
        }
        return new h91.kShadow(bArr);
    }

    public static h91.kShadow b(String str) {
        k71.k.g(str, "<this>");
        byte[] bytes = str.getBytes(t71.a.a);
        k71.k.f(bytes, "getBytes(...)");
        h91.kShadow kVar = new h91.kShadow(bytes);
        kVar.t = str;
        return kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean e(v5.b bVar, Editable editable, int i, int i2, boolean z) {
        int min;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int max = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z2) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z2 = true;
                                    }
                                } else if (!z2) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i2, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    min = Math.min(selectionEnd + i2, editable.length());
                }
                u5.u[] uVarArr = (u5.u[]) editable.getSpans(selectionStart, min, u5.u.class);
                if (uVarArr != null && uVarArr.length > 0) {
                    for (u5.u uVar : uVarArr) {
                        int spanStart = editable.getSpanStart(uVar);
                        int spanEnd = editable.getSpanEnd(uVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(max3, min2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static h91.kShadow f(byte[] bArr) {
        h91.kShadow kVar = h91.kShadow.u;
        int length = bArr.length;
        h91.b.e(bArr.length, 0, length);
        return new h91.kShadow(x61.l.C(bArr, 0, length));
    }

    public Object c() {
        switch (this.r) {
            case 3:
                List list = com.google.android.gms.measurement.internal.c0.a;
                Boolean bool = (Boolean) x8.a.b();
                bool.getClass();
                return bool;
            case 4:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                Long l = (Long) b7.y.b();
                l.getClass();
                return l;
            case 5:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                Long l2 = (Long) b7.j.b();
                l2.getClass();
                return l2;
            default:
                List list4 = com.google.android.gms.measurement.internal.c0.a;
                m8.s.b();
                Boolean bool2 = (Boolean) o8.e.b();
                bool2.getClass();
                return bool2;
        }
    }

    public aa.m d() {
        kz.Companion.getClass();
        aa.q0 q0Var = kz.O;
        k71.k.g(q0Var, "type");
        List list = d30.a.a;
        List list2 = d30.a.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == d.class;
            default:
                return super.equals(obj);
        }
    }

    public aa.p0 g() {
        return aa.c.c(e.a, false);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.xShadow.a(d.class).hashCode();
            default:
                return super.hashCode();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r6 == null) goto L6;
     */
    @Override // bm.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.github.domain.searchandfilter.filters.data.d l(String str) {
        List list;
        com.github.domain.database.serialization.d.Companion.getClass();
        if (str != null) {
            l81.n nVar = com.github.domain.database.serialization.d.b;
            list = (List) nVar.a(str, m71.a.z(new k81.d(b91.g.C(((l81.c) nVar).b, k71.xShadow.a(v2.class)), 0)));
        }
        list = x61.rShadow.r;
        return new MilestoneFilter(list);
    }

    public void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }

    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
