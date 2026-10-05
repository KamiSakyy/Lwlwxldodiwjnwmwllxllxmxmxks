package a5;

import android.view.View;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.nio.charset.Charset;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class i implements j11.e, p41.d, androidx.compose.runtime.j, androidx.compose.runtime.q2, com.github.rudroid.interfaces.v {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f416r;

    public /* synthetic */ i(int i) {
        this.f416r = i;
    }

    @Override // androidx.compose.runtime.q2
    public boolean a() {
        return false;
    }

    public Object apply(Object obj) {
        switch (this.f416r) {
            case 4:
                String o5 = a61.s0.b.o((a61.r0) obj);
                k71.k.f(o5, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
                byte[] bytes = o5.getBytes(t71.a.f32104a);
                k71.k.f(bytes, "getBytes(...)");
                return bytes;
            default:
                c51.a.b.getClass();
                return z41.c.a.o((y41.n2) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override // com.github.rudroid.interfaces.v
    public void b(View view, String str, String str2) {
        int i = com.github.rudroid.deploymentreview.m.f10894x;
        k71.k.g(view, "<unused var>");
        k71.k.g(str, "<unused var>");
        k71.k.g(str2, "<unused var>");
    }

    @Override // androidx.compose.runtime.j
    public void cancel() {
    }

    public Object f(androidx.lifecycle.b bVar) {
        switch (this.f416r) {
            case 6:
                return FirebaseSessionsRegistrar.b(bVar);
            default:
                return FirebaseSessionsRegistrar.a(bVar);
        }
    }
}
