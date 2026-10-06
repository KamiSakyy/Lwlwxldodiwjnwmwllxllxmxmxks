package z5;

import androidx.compose.runtime.j3;
import com.github.rudroid.profile.navigation.ProfileEntryPointRoute;
import com.github.rudroid.profile.navigation.ProfileScreenRoute;
import java.lang.annotation.Annotation;
import k81.z;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class f implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f34571r;

    public final Object a() {
        switch (this.f34571r) {
            case k5.f.J /* 0 */:
                j3 j3Var = g.f34572a;
                return null;
            case 1:
                throw new IllegalStateException("No default glance id");
            case 2:
                j3 j3Var2 = g.f34572a;
                return h6.b.B;
            case 3:
                return new z("com.github.rudroid.profile.navigation.ProfileEntryPointRoute", ProfileEntryPointRoute.INSTANCE, new Annotation[0]);
            default:
                return new z("com.github.rudroid.profile.navigation.ProfileScreenRoute", ProfileScreenRoute.INSTANCE, new Annotation[0]);
        }
    }
    public static final Object J = null;
}
