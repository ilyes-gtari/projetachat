#!/bin/bash

# Définition du chemin vers kubectl
KUBECTL_PATH=/usr/bin/kubectl

# Changement vers le répertoire contenant les fichiers YAML
cd kubernetes

# Application des ressources YAML avec kubectl
${KUBECTL_PATH} apply -f secret.yaml
sleep 2
${KUBECTL_PATH} apply -f configmap.yaml
sleep 2
${KUBECTL_PATH} apply -f mysql-deploy.yml
sleep 2
${KUBECTL_PATH} apply -f mysql-service.yml
sleep 2
${KUBECTL_PATH} apply -f app-deploy.yml
sleep 2
${KUBECTL_PATH} apply -f app-service.yml
