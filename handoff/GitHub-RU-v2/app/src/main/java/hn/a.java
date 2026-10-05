package hn;

import com.github.service.models.response.Avatar;
import oa.j;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final com.github.service.models.response.a a(j jVar) {
        Avatar avatar;
        String str = jVar.c;
        String b = jVar.b();
        if (b != null) {
            avatar = new Avatar(b, Avatar.Type.User);
        } else {
            Avatar.Companion.getClass();
            avatar = Avatar.u;
        }
        return new com.github.service.models.response.a(str, avatar, (String) null, false, (String) null, 60);
    }

}
