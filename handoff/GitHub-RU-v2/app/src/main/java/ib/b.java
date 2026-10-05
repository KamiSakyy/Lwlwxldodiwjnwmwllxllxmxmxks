package ib;

import com.github.service.models.BlockDuration;
import com.github.service.models.HideCommentReason;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final BlockDuration f26162a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26163b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26164c;

    /* renamed from: d, reason: collision with root package name */
    public final HideCommentReason f26165d;

    public b(BlockDuration blockDuration, boolean z10, boolean z11, HideCommentReason hideCommentReason) {
        k.g(blockDuration, "duration");
        this.f26162a = blockDuration;
        this.f26163b = z10;
        this.f26164c = z11;
        this.f26165d = hideCommentReason;
    }

    public static b a(b bVar, BlockDuration blockDuration, boolean z10, boolean z11, HideCommentReason hideCommentReason, int i) {
        if ((i & 1) != 0) {
            blockDuration = bVar.f26162a;
        }
        if ((i & 2) != 0) {
            z10 = bVar.f26163b;
        }
        if ((i & 4) != 0) {
            z11 = bVar.f26164c;
        }
        if ((i & 8) != 0) {
            hideCommentReason = bVar.f26165d;
        }
        bVar.getClass();
        k.g(blockDuration, "duration");
        return new b(blockDuration, z10, z11, hideCommentReason);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f26162a == bVar.f26162a && this.f26163b == bVar.f26163b && this.f26164c == bVar.f26164c && this.f26165d == bVar.f26165d;
    }

    public final int hashCode() {
        int e5 = i.e(i.e(this.f26162a.hashCode() * 31, 31, this.f26163b), 31, this.f26164c);
        HideCommentReason hideCommentReason = this.f26165d;
        return e5 + (hideCommentReason == null ? 0 : hideCommentReason.hashCode());
    }

    public final String toString() {
        return "OrganizationUserBlock(duration=" + this.f26162a + ", hideComments=" + this.f26163b + ", notifyUser=" + this.f26164c + ", hideCommentsReason=" + this.f26165d + ")";
    }
}
