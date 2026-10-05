package v6;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final c f32741a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f32742b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f32743c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f32744d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                no.a.x(autoCloseable);
            } catch (Exception e5) {
                throw new RuntimeException(e5);
            }
        }
    }
}
