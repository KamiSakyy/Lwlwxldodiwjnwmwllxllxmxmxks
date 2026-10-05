package m81;

import java.util.Set;
import k81.a2;
import k81.d2;
import k81.u1;
import k81.x1;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class s {
    public static final Set a = x61.l.j0(new SerialDescriptor[]{x1.b, a2.b, u1.b, d2.b});

    public static final boolean a(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "<this>");
        return serialDescriptor.h() && a.contains(serialDescriptor);
    }
}
