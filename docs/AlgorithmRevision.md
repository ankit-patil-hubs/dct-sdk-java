

# AlgorithmRevision

A masking algorithm revision.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The algorithm revision ID. | 
**name** | **String** | The name of this algorithm revision. | 
**note** | **String** | A note of this algorithm. |  [optional]
**algorithmId** | **String** | The id of the algorithm that this revision belongs to. | 
**pluginId** | **String** | The id of the plugin that this algorithm revision belongs to. | 
**frameworkId** | **String** | The id of the framework that this algorithm revision belongs to. | 
**isPrimary** | **Boolean** | Whether this algorithm revision is the primary revision of its algorithm. | 
**isDefaultInstance** | **Boolean** | Whether this algorithm revision is defined in a plugin as a default instance. | 
**createDate** | **OffsetDateTime** | The date and time this algorithm revision was created. |  [optional]
**originEngines** | [**List&lt;AlgorithmRevisionOriginEngine&gt;**](AlgorithmRevisionOriginEngine.md) | The engines that this algorithm revision is originated from. |  [optional]
**config** | **Map&lt;String, Object&gt;** | The configuration of this algorithm revision. |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags of this algorithm revision. |  [optional]



