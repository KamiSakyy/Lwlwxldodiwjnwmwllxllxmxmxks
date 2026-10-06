package h11;

import android.os.Bundle;
import androidx.lifecycle.o1;
import com.github.developersettings.DeveloperSettingsActivity;
import com.github.testingsettings.TestingSettingsActivity;
import com.google.android.gms.internal.measurement.n4;
import com.google.android.gms.internal.measurement.z3;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b extends kShadow.i implements o61.b {
    public final /* synthetic */ int S;
    public n4 T;
    public volatile m61.b U;
    public Object V;
    public boolean W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i) {
        super(2131558448);
        this.S = i;
        switch (i) {
            case 1:
                super(2131558432);
                this.V = new Object();
                this.W = false;
                C(new a((DeveloperSettingsActivity) this, 1));
                break;
            default:
                this.V = new Object();
                this.W = false;
                C(new a((TestingSettingsActivity) this, 0));
                break;
        }
    }

    public final m61.b Y() {
        switch (this.S) {
            case 0:
                if (this.U == null) {
                    synchronized (this.V) {
                        try {
                            if (this.U == null) {
                                this.U = new m61.b(this, 0);
                            }
                        } finally {
                        }
                    }
                }
                return this.U;
            default:
                if (this.U == null) {
                    synchronized (this.V) {
                        try {
                            if (this.U == null) {
                                this.U = new m61.b(this, 0);
                            }
                        } finally {
                        }
                    }
                }
                return this.U;
        }
    }

    public final o1 f0() {
        switch (this.S) {
        }
        return z3.r(this, super/*d.j*/.f0());
    }

    public void onCreate(Bundle bundle) {
        switch (this.S) {
            case 0:
                super.onCreate(bundle);
                n4 b = Y().b();
                this.T = b;
                if (((t6.c) b.s) == null) {
                    b.n(g0());
                    break;
                }
                break;
            default:
                super.onCreate(bundle);
                n4 b2 = Y().b();
                this.T = b2;
                if (((t6.c) b2.s) == null) {
                    b2.n(g0());
                    break;
                }
                break;
        }
    }

    public final void onDestroy() {
        switch (this.S) {
            case 0:
                super.onDestroy();
                n4 n4Var = this.T;
                if (n4Var != null) {
                    n4Var.s = null;
                    break;
                }
                break;
            default:
                super.onDestroy();
                n4 n4Var2 = this.T;
                if (n4Var2 != null) {
                    n4Var2.s = null;
                    break;
                }
                break;
        }
    }

    @Override // o61.b
    public final Object w() {
        switch (this.S) {
        }
        return Y().w();
    }
    public Object C(Object) { return null; }
}
