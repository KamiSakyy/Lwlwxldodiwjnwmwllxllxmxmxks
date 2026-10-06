package pe;

import com.github.service.models.response.type.CommentAuthorAssociation;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public class b {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30533a;

        static {
            int[] iArr = new int[CommentAuthorAssociation.values().length];
            try {
                iArr[CommentAuthorAssociation.MEMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommentAuthorAssociation.OWNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommentAuthorAssociation.COLLABORATOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommentAuthorAssociation.CONTRIBUTOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f30533a = iArr;
        }
    }

    public static final boolean a(CommentAuthorAssociation commentAuthorAssociation) {
        k.g(commentAuthorAssociation, "<this>");
        int i = a.f30533a[commentAuthorAssociation.ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public static final int b(CommentAuthorAssociation commentAuthorAssociation) {
        k.g(commentAuthorAssociation, "<this>");
        int i = a.f30533a[commentAuthorAssociation.ordinal()];
        if (i == 1) {
            return 2131951909;
        }
        if (i == 2) {
            return 2131951910;
        }
        if (i != 3) {
            return i != 4 ? 2131951921 : 2131951908;
        }
        return 2131951907;
    }
}
