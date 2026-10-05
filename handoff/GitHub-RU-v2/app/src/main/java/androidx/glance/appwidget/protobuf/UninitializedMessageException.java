package androidx.glance.appwidget.protobuf;

/* loaded from: /home/user/work/p/classes.dex */
public class UninitializedMessageException extends RuntimeException {
    public UninitializedMessageException() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
