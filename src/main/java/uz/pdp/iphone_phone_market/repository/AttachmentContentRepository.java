package uz.pdp.iphone_phone_market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.iphone_phone_market.model.AttachmentContent;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {
    AttachmentContent findByAttachmentId(Integer attachment_id);
}
