package r01;

import com.github.service.models.response.type.CommentAuthorAssociation;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public static CommentAuthorAssociation a(String str) {
        CommentAuthorAssociation commentAuthorAssociation;
        CommentAuthorAssociation[] values = CommentAuthorAssociation.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                commentAuthorAssociation = null;
                break;
            }
            commentAuthorAssociation = values[i];
            if (k71.k.b(commentAuthorAssociation.getRawValue(), str)) {
                break;
            }
            i++;
        }
        return commentAuthorAssociation == null ? CommentAuthorAssociation.UNKNOWN__ : commentAuthorAssociation;
    }
}
