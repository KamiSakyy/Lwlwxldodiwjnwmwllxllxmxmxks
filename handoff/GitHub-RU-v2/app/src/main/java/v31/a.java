package v31;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import sy.n;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a extends n {
    public final /* synthetic */ int a;
    public SideSheetBehavior b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.a = i;
        this.b = sideSheetBehavior;
    }

    public final boolean B(View view, float f) {
        switch (this.a) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.b;
                float abs = Math.abs((f * sideSheetBehavior.k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.b;
                float abs2 = Math.abs((f * sideSheetBehavior2.k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    public final void K(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.a) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }

    public final void L(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.a) {
            case 0:
                if (i <= this.b.m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.b.m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }

    public final int e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    public final float f(int i) {
        switch (this.a) {
            case 0:
                float k = k();
                return (i - k) / (j() - k);
            default:
                float f = this.b.m;
                return (f - i) / (f - j());
        }
    }

    public final int i(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    public final int j() {
        switch (this.a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.b;
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.b;
                return Math.max(0, (sideSheetBehavior2.m - sideSheetBehavior2.l) - sideSheetBehavior2.o);
        }
    }

    public final int k() {
        switch (this.a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.b;
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return this.b.m;
        }
    }

    public final int l() {
        switch (this.a) {
            case 0:
                return this.b.o;
            default:
                return this.b.m;
        }
    }

    public final int m() {
        switch (this.a) {
            case 0:
                return -this.b.l;
            default:
                return j();
        }
    }

    public final int n(View view) {
        switch (this.a) {
            case 0:
                return view.getRight() + this.b.o;
            default:
                return view.getLeft() - this.b.o;
        }
    }

    public final int o(CoordinatorLayout coordinatorLayout) {
        switch (this.a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    public final int p() {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    public final boolean q(float f) {
        switch (this.a) {
            case 0:
                if (f > 0.0f) {
                }
                break;
            default:
                if (f < 0.0f) {
                }
                break;
        }
        return false;
    }

    public final boolean t(View view) {
        switch (this.a) {
            case 0:
                if (view.getRight() < (j() - k()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (j() + this.b.m) / 2) {
                }
                break;
        }
        return false;
    }

    public final boolean u(float f, float f2) {
        switch (this.a) {
            case 0:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500) {
                }
                break;
            default:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500) {
                }
                break;
        }
        return false;
    }







    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class CoordinatorLayout {
        public CoordinatorLayout() {
        }
    }
}
