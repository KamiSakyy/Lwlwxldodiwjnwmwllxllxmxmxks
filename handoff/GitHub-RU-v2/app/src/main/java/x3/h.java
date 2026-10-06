package x3;

import com.google.android.gms.internal.play_billing.n1;

/* loaded from: /home/user/work/p/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Object f33741a;

    /* renamed from: b, reason: collision with root package name */
    public k f33742b;

    /* renamed from: c, reason: collision with root package name */
    public m f33743c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f33744d;

    public final void a(Object obj) {
        this.f33744d = true;
        k kVar = this.f33742b;
        if (kVar == null || !kVar.f33747s.k(obj)) {
            return;
        }
        this.f33741a = null;
        this.f33742b = null;
        this.f33743c = null;
    }

    public final void b(Throwable th) {
        this.f33744d = true;
        k kVar = this.f33742b;
        if (kVar == null || !kVar.f33747s.l(th)) {
            return;
        }
        this.f33741a = null;
        this.f33742b = null;
        this.f33743c = null;
    }

    public final void finalize() {
        m mVar;
        k kVar = this.f33742b;
        if (kVar != null) {
            j jVar = kVar.f33747s;
            if (!jVar.isDone()) {
                jVar.l(new n1("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f33741a, 3));
            }
        }
        if (this.f33744d || (mVar = this.f33743c) == null) {
            return;
        }
        mVar.k(null);
    }
    public Object a = null;
    public Object b = null;
    public Object c = null;
    public Object d = null;
}
