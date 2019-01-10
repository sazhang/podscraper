package org.szhang.personal.podscraper.repositories;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.szhang.personal.podscraper.domain.Podcast;

import java.util.List;

/**
 * Support queries of Podcast nodes.
 */
@RepositoryRestResource(collectionResourceRel = "podcasts", path = "podcasts")
public interface PodcastRepository extends Neo4jRepository<Podcast, Long> {

  Podcast findByName(@Param("name") String podcastName);
  /*List<Podcast> findByRatingGreaterThanEqual(@Param("rating") double rating);

  @Query("MATCH (p:Podcast)-[r:IN_CATEGORY]->(c:Category) RETURN p,c")
  List<Podcast> findByCategoriesLike(@Param("categories") List<String> keywords);
  List<Podcast> findByKeywordsLike(@Param("keywords") List<String> keywords);

  // TODO: figure out and/or queries
  List<Podcast> findByHosts(List<String> hosts);*/

}