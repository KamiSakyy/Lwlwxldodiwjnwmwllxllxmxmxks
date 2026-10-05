package androidx.compose.ui.layout;

import java.util.Map;

/* loaded from: /home/user/work/p/classes.dex */
public interface x0 extends r {
    w0 A(int i, int i10, Map map, j71.c cVar, j71.c cVar2);

    default w0 h0(int i, int i10, Map map, j71.c cVar) {
        return A(i, i10, map, null, cVar);
    }
}
