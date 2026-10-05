package mp;

import com.github.service.dotcom.models.response.copilot.serialization.ChatThreadWithMessagesResponse;
import com.github.service.dotcom.models.response.copilot.serialization.ChatThreadsResponse;
import com.github.service.dotcom.models.response.copilot.serialization.CreateChatThreadResponse;
import com.github.service.dotcom.models.response.copilot.serialization.PatchThreadNameInput;
import com.github.service.dotcom.models.response.copilot.serialization.PatchThreadNameResponse;
import com.github.service.dotcom.models.response.copilot.serialization.PostMessageFeedbackInput;
import com.github.service.dotcom.models.response.copilot.serialization.PostMessageInput;
import fa1.q0;
import ga1.f;
import ga1.n;
import ga1.o;
import ga1.s;
import ga1.w;
import q81.c0;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public interface b {
    @o("github/chat/threads/{id}/messages/{messageId}/feedback")
    Object a(@s("id") String str, @s("messageId") String str2, @ga1.a PostMessageFeedbackInput postMessageFeedbackInput, a71.c<? super q0<a0>> cVar);

    @f("github/chat/threads/{id}/messages")
    Object b(@s("id") String str, a71.c<? super ChatThreadWithMessagesResponse> cVar);

    @f("github/chat/threads")
    Object c(a71.c<? super ChatThreadsResponse> cVar);

    @ga1.b("github/chat/threads/{id}")
    Object d(@s("id") String str, a71.c<? super q0<a0>> cVar);

    @n("github/chat/threads/{id}/name")
    Object e(@s("id") String str, @ga1.a PatchThreadNameInput patchThreadNameInput, a71.c<? super PatchThreadNameResponse> cVar);

    @o("github/chat/threads/{id}/messages")
    @w
    Object f(@s("id") String str, @ga1.a PostMessageInput postMessageInput, a71.c<? super q0<c0>> cVar);

    @o("github/chat/threads")
    Object g(a71.c<? super CreateChatThreadResponse> cVar);
}
