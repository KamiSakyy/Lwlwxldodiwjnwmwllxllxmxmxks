package l11;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements i51.c {
    public static final i a = new i();
    public static final i51.b b = i51.b.a("eventTimeMs");
    public static final i51.b c = i51.b.a("eventCode");
    public static final i51.b d = i51.b.a("complianceData");
    public static final i51.b e = i51.b.a("eventUptimeMs");
    public static final i51.b f = i51.b.a("sourceExtension");
    public static final i51.b g = i51.b.a("sourceExtensionJsonProto3");
    public static final i51.b h = i51.b.a("timezoneOffsetSeconds");
    public static final i51.b i = i51.b.a("networkConnectionInfo");
    public static final i51.b j = i51.b.a("experimentIds");

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        i51.d dVar = (i51.d) obj2;
        s sVar = (s) ((e0) obj);
        dVar.d(b, sVar.a);
        dVar.a(c, sVar.b);
        dVar.a(d, sVar.c);
        dVar.d(e, sVar.d);
        dVar.a(f, sVar.e);
        dVar.a(g, sVar.f);
        dVar.d(h, sVar.g);
        dVar.a(i, sVar.h);
        dVar.a(j, sVar.i);
    }
}
