package k8;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f27811a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27812b;

    /* renamed from: c, reason: collision with root package name */
    public final a f27813c;

    public b(String str, a aVar) {
        if (str.isEmpty() || str.charAt(0) != '/') {
            throw new IllegalArgumentException("Path should start with a slash '/'.");
        }
        if (!str.endsWith("/")) {
            throw new IllegalArgumentException("Path should end with a slash '/'");
        }
        this.f27811a = "appassets.androidplatform.net";
        this.f27812b = str;
        this.f27813c = aVar;
    }
}
