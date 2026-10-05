package d31;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jo.f4;
import sy.o;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c extends z3 {
    public final /* synthetic */ int b;
    public final /* synthetic */ l4.b c;

    public /* synthetic */ c(l4.b bVar, int i) {
        this.b = i;
        this.c = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.z3
    public final void A(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.b) {
            case 0:
                ((BottomSheetBehavior) this.c).z(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.c;
                WeakReference weakReference = sideSheetBehavior.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.a.L(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.v;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.a.f(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw f4.g(it);
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r0.a.t(r6) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (java.lang.Math.abs(r7 - r0.a.j()) < java.lang.Math.abs(r7 - r0.a.k())) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r7 > r0.F) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d0, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r0.C()) < java.lang.Math.abs(r6.getTop() - r0.F)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011b, code lost:
    
        if (java.lang.Math.abs(r7 - r0.E) < java.lang.Math.abs(r7 - r0.H)) goto L29;
     */
    @Override // com.google.android.gms.internal.measurement.z3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(View view, float f, float f2) {
        int i;
        switch (this.b) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.c;
                int i2 = 6;
                if (f2 < 0.0f) {
                    if (!bottomSheetBehavior.b) {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i2 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.L(view, i2, true);
                    break;
                } else if (bottomSheetBehavior.J && bottomSheetBehavior.K(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.e) {
                        if (view.getTop() <= (bottomSheetBehavior.C() + bottomSheetBehavior.W) / 2) {
                            if (!bottomSheetBehavior.b) {
                                break;
                            }
                            i2 = 3;
                            bottomSheetBehavior.getClass();
                            bottomSheetBehavior.L(view, i2, true);
                        }
                    }
                    i2 = 5;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.L(view, i2, true);
                } else {
                    if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.b) {
                            break;
                        } else {
                            int i3 = bottomSheetBehavior.F;
                            if (top2 < i3) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.H)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 3;
                            } else {
                                if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.H)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.F) < Math.abs(top3 - bottomSheetBehavior.H)) {
                                bottomSheetBehavior.getClass();
                            }
                        }
                        i2 = 4;
                    }
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.L(view, i2, true);
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.c;
                if (!sideSheetBehavior.a.q(f)) {
                    if (sideSheetBehavior.a.B(view, f)) {
                        if (!sideSheetBehavior.a.u(f, f2)) {
                            break;
                        }
                        i = 5;
                    } else {
                        if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                            int left = view.getLeft();
                            break;
                        }
                        i = 5;
                    }
                    sideSheetBehavior.z(view, i, true);
                    break;
                }
                i = 3;
                sideSheetBehavior.z(view, i, true);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        if (r6.canScrollVertically(-1) != false) goto L36;
     */
    @Override // com.google.android.gms.internal.measurement.z3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean U(View view, int i) {
        WeakReference weakReference;
        switch (this.b) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.c;
                int i2 = bottomSheetBehavior.O;
                if (i2 != 1 && !bottomSheetBehavior.e0) {
                    if (i2 == 3 && bottomSheetBehavior.c0 == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.Y;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null) {
                            break;
                        }
                    }
                    SystemClock.uptimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.X;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        return true;
                    }
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.c;
                return (sideSheetBehavior.h == 1 || (weakReference = sideSheetBehavior.p) == null || weakReference.get() != view) ? false : true;
        }
    }

    @Override // com.google.android.gms.internal.measurement.z3
    public final int j(View view, int i) {
        switch (this.b) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.c;
                return o.b(i, sideSheetBehavior.a.m(), sideSheetBehavior.a.l());
        }
    }

    @Override // com.google.android.gms.internal.measurement.z3
    public final int k(View view, int i) {
        switch (this.b) {
            case 0:
                return o.b(i, ((BottomSheetBehavior) this.c).C(), v());
            default:
                return view.getTop();
        }
    }

    @Override // com.google.android.gms.internal.measurement.z3
    public int u(View view) {
        switch (this.b) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.c;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            default:
                return super.u(view);
        }
    }

    @Override // com.google.android.gms.internal.measurement.z3
    public int v() {
        switch (this.b) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.c;
                return bottomSheetBehavior.J ? bottomSheetBehavior.W : bottomSheetBehavior.H;
            default:
                return super.v();
        }
    }

    @Override // com.google.android.gms.internal.measurement.z3
    public final void z(int i) {
        switch (this.b) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.c;
                    if (bottomSheetBehavior.L) {
                        bottomSheetBehavior.J(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.c;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.x(1);
                        break;
                    }
                }
                break;
        }
    }
}
