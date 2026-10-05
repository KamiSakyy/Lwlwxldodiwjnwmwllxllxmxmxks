package l7;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class n1 {

    /* renamed from: t, reason: collision with root package name */
    public static final List f28208t = Collections.EMPTY_LIST;

    /* renamed from: a, reason: collision with root package name */
    public final View f28209a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f28210b;

    /* renamed from: j, reason: collision with root package name */
    public int f28217j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f28223r;

    /* renamed from: s, reason: collision with root package name */
    public m0 f28224s;

    /* renamed from: c, reason: collision with root package name */
    public int f28211c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f28212d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f28213e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f28214f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f28215g = -1;

    /* renamed from: h, reason: collision with root package name */
    public n1 f28216h = null;
    public n1 i = null;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f28218k = null;
    public List l = null;
    public int m = 0;

    /* renamed from: n, reason: collision with root package name */
    public e1 f28219n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f28220o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f28221p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f28222q = -1;

    public n1(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f28209a = view;
    }

    public final void g(int i) {
        this.f28217j = i | this.f28217j;
    }

    public final int h() {
        RecyclerView recyclerView = this.f28223r;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.M(this);
    }

    public final int i() {
        RecyclerView recyclerView;
        m0 adapter;
        int M;
        if (this.f28224s == null || (recyclerView = this.f28223r) == null || (adapter = recyclerView.getAdapter()) == null || (M = this.f28223r.M(this)) == -1) {
            return -1;
        }
        return adapter.j(this.f28224s, this, M);
    }

    public final int j() {
        int i = this.f28215g;
        return i == -1 ? this.f28211c : i;
    }

    public final List k() {
        ArrayList arrayList;
        return ((this.f28217j & 1024) != 0 || (arrayList = this.f28218k) == null || arrayList.size() == 0) ? f28208t : this.l;
    }

    public final boolean l() {
        View view = this.f28209a;
        return (view.getParent() == null || view.getParent() == this.f28223r) ? false : true;
    }

    public final boolean m() {
        return (this.f28217j & 1) != 0;
    }

    public final boolean n() {
        return (this.f28217j & 4) != 0;
    }

    public final boolean o() {
        if ((this.f28217j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = a5.c1.f374a;
        return !this.f28209a.hasTransientState();
    }

    public final boolean p() {
        return (this.f28217j & 8) != 0;
    }

    public final boolean q() {
        return this.f28219n != null;
    }

    public final boolean r() {
        return (this.f28217j & 256) != 0;
    }

    public final boolean s() {
        return (this.f28217j & 2) != 0;
    }

    public final void t(int i, boolean z10) {
        if (this.f28212d == -1) {
            this.f28212d = this.f28211c;
        }
        if (this.f28215g == -1) {
            this.f28215g = this.f28211c;
        }
        if (z10) {
            this.f28215g += i;
        }
        this.f28211c += i;
        View view = this.f28209a;
        if (view.getLayoutParams() != null) {
            ((x0) view.getLayoutParams()).f28352c = true;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f28211c + " id=" + this.f28213e + ", oldPos=" + this.f28212d + ", pLpos:" + this.f28215g);
        if (q()) {
            sb2.append(" scrap ");
            sb2.append(this.f28220o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (n()) {
            sb2.append(" invalid");
        }
        if (!m()) {
            sb2.append(" unbound");
        }
        if ((this.f28217j & 2) != 0) {
            sb2.append(" update");
        }
        if (p()) {
            sb2.append(" removed");
        }
        if (w()) {
            sb2.append(" ignored");
        }
        if (r()) {
            sb2.append(" tmpDetached");
        }
        if (!o()) {
            sb2.append(" not recyclable(" + this.m + ")");
        }
        if ((this.f28217j & 512) != 0 || n()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f28209a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }

    public final void u() {
        if (RecyclerView.T0 && r()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f28217j = 0;
        this.f28211c = -1;
        this.f28212d = -1;
        this.f28213e = -1L;
        this.f28215g = -1;
        this.m = 0;
        this.f28216h = null;
        this.i = null;
        ArrayList arrayList = this.f28218k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f28217j &= -1025;
        this.f28221p = 0;
        this.f28222q = -1;
        RecyclerView.l(this);
    }

    public final void v(boolean z10) {
        int i = this.m;
        int i10 = z10 ? i - 1 : i + 1;
        this.m = i10;
        if (i10 < 0) {
            this.m = 0;
            if (RecyclerView.T0) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            toString();
        } else if (!z10 && i10 == 1) {
            this.f28217j |= 16;
        } else if (z10 && i10 == 0) {
            this.f28217j &= -17;
        }
        if (RecyclerView.U0) {
            toString();
        }
    }

    public final boolean w() {
        return (this.f28217j & 128) != 0;
    }

    public final boolean x() {
        return (this.f28217j & 32) != 0;
    }







}
