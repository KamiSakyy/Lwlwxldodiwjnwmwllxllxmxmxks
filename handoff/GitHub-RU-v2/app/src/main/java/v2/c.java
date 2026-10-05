package v2;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements b2.t {

    /* renamed from: a, reason: collision with root package name */
    public static final c f32439a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f32440b;

    @Override // b2.t
    public final boolean b() {
        Boolean bool = f32440b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw x.i.p("canFocus is read before it is written");
    }

    @Override // b2.t
    public final void e(boolean z10) {
        f32440b = Boolean.valueOf(z10);
    }
}
