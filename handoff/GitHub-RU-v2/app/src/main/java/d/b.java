package d;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20882r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f20883s;

    public /* synthetic */ b(j jVar, int i) {
        this.f20882r = i;
        this.f20883s = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20882r) {
            case k5.f.J /* 0 */:
                this.f20883s.invalidateOptionsMenu();
                break;
            default:
                j.z(this.f20883s);
                break;
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class j<T1,T2,T3,T4> {
        public j() {
        }
    }
}
