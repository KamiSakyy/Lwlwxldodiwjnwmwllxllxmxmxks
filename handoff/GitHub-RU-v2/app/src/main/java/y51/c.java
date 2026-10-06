package y51;

import a0.e0;
import a0.h0;
import a0.u;
import a0.v;
import a5.c1;
import a5.g0;
import a5.i0;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.foundation.lazy.layout.s0;
import androidx.compose.runtime.x;
import b5.f;
import b5.g;
import b5.o;
import c21.d;
import com.google.android.gms.measurement.internal.a2;
import com.google.android.gms.measurement.internal.b2;
import com.google.android.gms.measurement.internal.i;
import com.google.android.gms.measurement.internal.i1;
import com.google.android.gms.measurement.internal.o1;
import com.google.android.gms.measurement.internal.q0;
import com.google.android.gms.measurement.internal.s4;
import com.google.android.gms.measurement.internal.t2;
import com.google.android.gms.measurement.internal.y1;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import w31.e;

/* loaded from: /home/user/work/p/classes4.dex */
public class c implements o, c41.c, d, c21.b, c21.c, s4 {
    public static volatile c t;
    public final /* synthetic */ int r;
    public Object s;

    public /* synthetic */ c(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    public static c q(String str) {
        return new c(25, (TextUtils.isEmpty(str) || str.length() > 1) ? y1.UNINITIALIZED : b2.e(str.charAt(0)));
    }

    @Override // com.google.android.gms.measurement.internal.s4
    public void a(String str, String str2, Bundle bundle) {
        t2 t2Var = (t2) this.s;
        if (!TextUtils.isEmpty(str)) {
            t2Var.getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
        ((o1) ((s0) t2Var).s).B.getClass();
        t2Var.E("auto", "_err", bundle, true, true, System.currentTimeMillis());
    }

    public boolean b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.s;
        if (!swipeDismissBehavior.w(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.e;
        int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = c1.a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        e eVar = swipeDismissBehavior.b;
        if (eVar != null) {
            eVar.a(view);
        }
        return true;
    }

    @Override // c41.c
    public Object c() {
        return ((a7.d) this.s).a;
    }

    @Override // c21.d
    public void d(z11.b bVar) {
        c21.e eVar = (c21.e) this.s;
        if (bVar.s == 0) {
            eVar.k(null, eVar.t());
            return;
        }
        c21.c cVar = eVar.p;
        if (cVar != null) {
            cVar.g(bVar);
        }
    }

    @Override // c21.b
    public void e(int i) {
        ((a21.d) this.s).e(i);
    }

    @Override // c21.b
    public void f() {
        ((a21.d) this.s).f();
    }

    @Override // c21.c
    public void g(z11.b bVar) {
        ((a21.e) this.s).g(bVar);
    }

    public void h(int i, f fVar, String str, Bundle bundle) {
    }

    public f i(int i) {
        return null;
    }

    public void j() {
        ((x) this.s).getClass();
    }

    public f k(int i) {
        return null;
    }

    public e0 l(int i) {
        switch (this.r) {
            case 2:
                return ((h0[]) this.s)[i];
            case 3:
                return (h0) this.s;
            default:
                return (e0) this.s;
        }
    }

    public void m() {
        ((androidx.fragment.app.e0) this.s).u.V();
    }

    public boolean n(int i, int i2, Bundle bundle) {
        return false;
    }

    public void o(int i, String str, List list, boolean z, boolean z2) {
        q0 q0Var;
        i1 i1Var = (i1) this.s;
        int i2 = i - 1;
        if (i2 == 0) {
            com.google.android.gms.measurement.internal.s0 s0Var = ((o1) ((s0) i1Var).s).w;
            o1.m(s0Var);
            q0Var = s0Var.E;
        } else if (i2 != 1) {
            if (i2 == 3) {
                com.google.android.gms.measurement.internal.s0 s0Var2 = ((o1) ((s0) i1Var).s).w;
                o1.m(s0Var2);
                q0Var = s0Var2.F;
            } else if (i2 != 4) {
                com.google.android.gms.measurement.internal.s0 s0Var3 = ((o1) ((s0) i1Var).s).w;
                o1.m(s0Var3);
                q0Var = s0Var3.D;
            } else if (z) {
                com.google.android.gms.measurement.internal.s0 s0Var4 = ((o1) ((s0) i1Var).s).w;
                o1.m(s0Var4);
                q0Var = s0Var4.B;
            } else if (z2) {
                com.google.android.gms.measurement.internal.s0 s0Var5 = ((o1) ((s0) i1Var).s).w;
                o1.m(s0Var5);
                q0Var = s0Var5.A;
            } else {
                com.google.android.gms.measurement.internal.s0 s0Var6 = ((o1) ((s0) i1Var).s).w;
                o1.m(s0Var6);
                q0Var = s0Var6.C;
            }
        } else if (z) {
            com.google.android.gms.measurement.internal.s0 s0Var7 = ((o1) ((s0) i1Var).s).w;
            o1.m(s0Var7);
            q0Var = s0Var7.y;
        } else if (z2) {
            com.google.android.gms.measurement.internal.s0 s0Var8 = ((o1) ((s0) i1Var).s).w;
            o1.m(s0Var8);
            q0Var = s0Var8.x;
        } else {
            com.google.android.gms.measurement.internal.s0 s0Var9 = ((o1) ((s0) i1Var).s).w;
            o1.m(s0Var9);
            q0Var = s0Var9.z;
        }
        int size = list.size();
        if (size == 1) {
            q0Var.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            q0Var.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            q0Var.a(str);
        } else {
            q0Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public void p(a2 a2Var, int i) {
        i iVar;
        if (i != -30) {
            if (i != -20) {
                if (i == -10) {
                    iVar = i.MANIFEST;
                } else if (i != 0) {
                    iVar = i != 30 ? i.UNSET : i.INITIALIZATION;
                }
            }
            iVar = i.API;
        } else {
            iVar = i.TCF;
        }
        ((EnumMap) this.s).put((EnumMap) a2Var, (a2) iVar);
    }

    public void r(a2 a2Var, i iVar) {
        ((EnumMap) this.s).put((EnumMap) a2Var, (a2) iVar);
    }

    public String toString() {
        switch (this.r) {
            case 24:
                StringBuilder sb = new StringBuilder("1");
                for (a2 a2Var : a2.values()) {
                    i iVar = (i) ((EnumMap) this.s).get(a2Var);
                    if (iVar == null) {
                        iVar = i.UNSET;
                    }
                    sb.append(iVar.r);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public c(c21.e eVar) {
        this.r = 18;
        Objects.requireNonNull(eVar);
        this.s = eVar;
    }

    public c(EnumMap enumMap) {
        this.r = 24;
        EnumMap enumMap2 = new EnumMap(a2.class);
        this.s = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public c(int i) {
        this.r = i;
        switch (i) {
            case 11:
                this.s = null;
                break;
            case 13:
                break;
            case 17:
                this.s = new g(this);
                break;
            case 24:
                this.s = new EnumMap(a2.class);
                break;
            default:
                this.s = new HashSet();
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r7 == r3) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[LOOP:1: B:14:0x0046->B:15:0x0048, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int length;
        int i2;
        this.r = 1;
        int i3 = 1;
        int length2 = fArr.length - 1;
        v[][] vVarArr = new v[length2][];
        int i4 = 1;
        int i5 = 1;
        int i6 = 0;
        while (i6 < length2) {
            int i7 = iArr[i6];
            int i8 = 3;
            if (i7 != 0) {
                if (i7 != i3) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            i8 = 4;
                            if (i7 != 4) {
                                i8 = 5;
                                if (i7 != 5) {
                                    i = i5;
                                    float[] fArr3 = fArr2[i6];
                                    int i9 = i6 + 1;
                                    float[] fArr4 = fArr2[i9];
                                    float f = fArr[i6];
                                    float f2 = fArr[i9];
                                    length = (fArr3.length % 2) + (fArr3.length / 2);
                                    v[] vVarArr2 = new v[length];
                                    i2 = 0;
                                    while (i2 < length) {
                                        int i10 = i2 * 2;
                                        int i12 = i2;
                                        int i13 = i10 + 1;
                                        vVarArr2[i12] = new v(i, f, f2, fArr3[i10], fArr3[i13], fArr4[i10], fArr4[i13]);
                                        i2 = i12 + 1;
                                    }
                                    vVarArr[i6] = vVarArr2;
                                    i6 = i9;
                                    i5 = i;
                                    i3 = 1;
                                }
                            }
                        }
                    }
                    i4 = 2;
                    i = i4;
                    float[] fArr32 = fArr2[i6];
                    int i92 = i6 + 1;
                    float[] fArr42 = fArr2[i92];
                    float f3 = fArr[i6];
                    float f22 = fArr[i92];
                    length = (fArr32.length % 2) + (fArr32.length / 2);
                    v[] vVarArr22 = new v[length];
                    i2 = 0;
                    while (i2 < length) {
                    }
                    vVarArr[i6] = vVarArr22;
                    i6 = i92;
                    i5 = i;
                    i3 = 1;
                }
                i4 = i3;
                i = i4;
                float[] fArr322 = fArr2[i6];
                int i922 = i6 + 1;
                float[] fArr422 = fArr2[i922];
                float f32 = fArr[i6];
                float f222 = fArr[i922];
                length = (fArr322.length % 2) + (fArr322.length / 2);
                v[] vVarArr222 = new v[length];
                i2 = 0;
                while (i2 < length) {
                }
                vVarArr[i6] = vVarArr222;
                i6 = i922;
                i5 = i;
                i3 = 1;
            }
            i = i8;
            float[] fArr3222 = fArr2[i6];
            int i9222 = i6 + 1;
            float[] fArr4222 = fArr2[i9222];
            float f322 = fArr[i6];
            float f2222 = fArr[i9222];
            length = (fArr3222.length % 2) + (fArr3222.length / 2);
            v[] vVarArr2222 = new v[length];
            i2 = 0;
            while (i2 < length) {
            }
            vVarArr[i6] = vVarArr2222;
            i6 = i9222;
            i5 = i;
            i3 = 1;
        }
        this.s = vVarArr;
    }

    public c(View view) {
        this.r = 5;
        if (Build.VERSION.SDK_INT >= 30) {
            i0 i0Var = new i0(view);
            i0Var.s = view;
            this.s = i0Var;
            return;
        }
        this.s = new g0(view);
    }

    public c(float f, float f2, u uVar) {
        this.r = 2;
        int b = uVar.b();
        h0[] h0VarArr = new h0[b];
        for (int i = 0; i < b; i++) {
            h0VarArr[i] = new h0(f, f2, uVar.a(i));
        }
        this.s = h0VarArr;
    }

    public c(float f, float f2) {
        this.r = 3;
        this.s = new h0(f, f2, 0.01f);
    }
    public Object k = null;
}
