package g11;

import androidx.compose.runtime.s;
import com.github.service.models.response.Avatar;
import f1.e;
import k71.k;
import s3.c;
import u9.d;
import w2.g1;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final d a(Avatar.Type type, s sVar) {
        k.g(type, "avatarType");
        int i = a.a[type.ordinal()];
        if (i == 1) {
            sVar.c0(-1056498222);
            sVar.q(false);
            return new u9.a();
        }
        if (i != 2) {
            throw e.r(-1056499179, sVar, false);
        }
        sVar.c0(1608347242);
        float W = ((c) sVar.j(g1.h)).W(4);
        u9.c cVar = new u9.c(W, W, W, W);
        sVar.q(false);
        return cVar;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s<T1,T2,T3,T4> {
        public s() {
        }
    }
}
