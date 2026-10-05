package yz0;

import com.github.service.models.response.Avatar;
import com.github.service.models.response.type.CommentAuthorAssociation;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q implements s {
    public final com.github.service.models.response.a a = new com.github.service.models.response.a("", (Avatar) null, (String) null, false, (String) null, 62);
    public final com.github.service.models.response.a b = new com.github.service.models.response.a("", (Avatar) null, (String) null, false, (String) null, 62);
    public final ZonedDateTime c = ZonedDateTime.now();
    public final String d = "";
    public final String e = "";
    public final String f = "";
    public final p0 g = p0.s;
    public final CommentAuthorAssociation h = CommentAuthorAssociation.NONE;

    @Override // yz0.s
    public final boolean a() {
        return false;
    }

    @Override // yz0.s
    public final String b() {
        return "";
    }

    @Override // yz0.s
    public final com.github.service.models.response.a c() {
        return this.b;
    }

    @Override // yz0.s
    public final String d() {
        return this.d;
    }

    @Override // yz0.s
    public final com.github.service.models.response.a e() {
        return this.a;
    }

    @Override // yz0.s
    public final CommentAuthorAssociation f() {
        return this.h;
    }

    @Override // yz0.s
    public final ZonedDateTime g() {
        return this.c;
    }

    @Override // yz0.s
    public final String getId() {
        return "";
    }

    @Override // yz0.s
    public final q0 getType() {
        return this.g;
    }

    @Override // yz0.s
    public final String getUrl() {
        return this.f;
    }

    @Override // yz0.s
    public final ZonedDateTime h() {
        return null;
    }

    @Override // yz0.s
    public final String i() {
        return this.e;
    }

    @Override // yz0.s
    public final boolean j() {
        return false;
    }

    @Override // yz0.s
    public final boolean k() {
        return false;
    }
}
