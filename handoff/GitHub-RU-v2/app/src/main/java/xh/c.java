package xh;

import fl.f;
import java.util.Collection;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public static final boolean a(f fVar) {
        Object obj = fVar.b;
        Collection collection = obj instanceof Collection ? (Collection) obj : null;
        return i21.a.y(fVar) && ((collection != null && collection.isEmpty()) || fVar.b == null);
    }
}
