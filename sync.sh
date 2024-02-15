#!/bin/bash

# Récupérer les noms des PipelineRuns créés dans la dernière synchronisation
pipelineruns=$(kubectl get pipelinerun -n default -o jsonpath='{.items[*].metadata.name}' | grep '^pipelines-trigger-')

# Marquer chaque PipelineRun comme validé
for run in $pipelineruns; do
    kubectl annotate pipelinerun -n default $run argocd.argoproj.io/sync-options='Validate=true'
done

echo "Les PipelineRuns qui commencent par 'pipelines-trigger-' ont été marqués comme validés avec succès."
