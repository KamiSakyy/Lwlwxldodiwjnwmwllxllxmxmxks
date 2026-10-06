package fd;

import k71.k;
import yz0.r2;

/* loaded from: /home/user/work/p/classes.dex */
public interface a {

    /* renamed from: fd.a$a, reason: collision with other inner class name */
    public static final class C0068a implements a {

        /* renamed from: a, reason: collision with root package name */
        public c f24396a;

        public C0068a(c cVar) {
            this.f24396a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0068a) && k.b(this.f24396a, ((C0068a) obj).f24396a);
        }

        public final int hashCode() {
            return this.f24396a.hashCode();
        }

        public final String toString() {
            return "EmojiSuggestion(emoji=" + this.f24396a + ")";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public r2 f24397a;

        public b(r2 r2Var) {
            k.g(r2Var, "mentionableItem");
            this.f24397a = r2Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && k.b(this.f24397a, ((b) obj).f24397a);
        }

        public final int hashCode() {
            return this.f24397a.hashCode();
        }

        public final String toString() {
            return "UserMentionSuggestion(mentionableItem=" + this.f24397a + ")";
        }
    }
}
