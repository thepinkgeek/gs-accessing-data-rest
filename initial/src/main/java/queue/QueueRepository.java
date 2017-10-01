package queue;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "queue", path = "queue")
public interface QueueRepository extends PagingAndSortingRepository<QueueItem, Long> {

    List<QueueItem> findByPatientId(@Param("patientId") long patientId);
    List<QueueItem> findByPosition(@Param("position") long position);
}